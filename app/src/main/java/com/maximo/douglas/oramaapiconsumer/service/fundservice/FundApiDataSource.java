package com.maximo.douglas.oramaapiconsumer.service.fundservice;

import com.maximo.douglas.oramaapiconsumer.domain.entity.fund.Fund;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface FundApiDataSource {

    @GET("/json/fund_detail_full.json?serializer=fund_detail_full")
    Call<List<Fund>> getFundApiResponse();

}
