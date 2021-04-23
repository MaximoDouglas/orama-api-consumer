package com.maximo.douglas.oramaapiconsumer.service.fundservice;

import com.maximo.douglas.oramaapiconsumer.domain.entity.fund.Fund;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class FundRemoteDataSourceImpl implements FundRemoteDataSource {

    private static FundRemoteDataSourceImpl INSTANCE;
    private final FundApiDataSource fundApiDataSource;

    private FundRemoteDataSourceImpl(FundApiDataSource apiDataSource) {
        fundApiDataSource = apiDataSource;
    }

    public static FundRemoteDataSourceImpl getInstance(FundApiDataSource fundApiDataSource) {
        if (INSTANCE == null) {
            INSTANCE = new FundRemoteDataSourceImpl(fundApiDataSource);
        }

        return INSTANCE;
    }

    @Override
    public void getFundApiList(GetFundListCallBack getFundListCallBack) {
        Call<List<Fund>> fundListApiCall = fundApiDataSource.getFundApiResponse();

        fundListApiCall.enqueue(new Callback<List<Fund>>() {
            @Override
            public void onResponse(Call<List<Fund>> call, Response<List<Fund>> response) {
                List<Fund> fundList = response.body();
                getFundListCallBack.getFundListSuccess(fundList);
            }

            @Override
            public void onFailure(Call<List<Fund>> call, Throwable throwable) {
                getFundListCallBack.getFundListFailure(throwable);
            }
        });
    }
}
