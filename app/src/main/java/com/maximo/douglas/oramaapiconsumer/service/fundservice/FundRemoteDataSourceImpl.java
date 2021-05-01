package com.maximo.douglas.oramaapiconsumer.service.fundservice;

import com.maximo.douglas.oramaapiconsumer.domain.entity.fund.Fund;

import java.util.List;

import javax.inject.Inject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class FundRemoteDataSourceImpl implements FundRemoteDataSource {

    private final FundApiDataSource fundApiDataSource;

    @Inject
    public FundRemoteDataSourceImpl(FundApiDataSource apiDataSource) {
        fundApiDataSource = apiDataSource;
    }

    @Override
    public Call<List<Fund>> getFundApiList() {
        return fundApiDataSource.getFundApiResponse();
    }
}
