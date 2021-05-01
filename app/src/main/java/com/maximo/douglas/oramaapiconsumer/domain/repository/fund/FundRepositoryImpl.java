package com.maximo.douglas.oramaapiconsumer.domain.repository.fund;

import com.maximo.douglas.oramaapiconsumer.domain.entity.fund.Fund;
import com.maximo.douglas.oramaapiconsumer.service.fundservice.FundRemoteDataSource;

import org.jetbrains.annotations.NotNull;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class FundRepositoryImpl implements FundRepository {

    private final FundRemoteDataSource fundRemoteDataSource;

    public FundRepositoryImpl(FundRemoteDataSource fundRemoteDataSource) {
        this.fundRemoteDataSource = fundRemoteDataSource;
    }

    @Override
    public void getFundList(GetFundListCallBack getFundListCallBack) {
        Call<List<Fund>> fundListApiCall = fundRemoteDataSource.getFundApiList();

        fundListApiCall.enqueue(new Callback<List<Fund>>() {
            @Override
            public void onResponse(@NotNull Call<List<Fund>> call, @NotNull Response<List<Fund>> response) {
                List<Fund> fundList = response.body();
                getFundListCallBack.getFundListSuccess(fundList);
            }

            @Override
            public void onFailure(@NotNull Call<List<Fund>> call, @NotNull Throwable throwable) {
                getFundListCallBack.getFundListFailure(throwable);
            }
        });
    }

}
