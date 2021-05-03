package com.maximo.douglas.oramaapiconsumer.service.fundservice;

import com.maximo.douglas.oramaapiconsumer.domain.entity.fund.Fund;

import java.util.List;

import retrofit2.Call;

public interface FundRemoteDataSource {

    Call<List<Fund>> getFundApiList();

}
