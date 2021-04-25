package com.maximo.douglas.oramaapiconsumer.di;

import com.maximo.douglas.oramaapiconsumer.service.fundservice.FundApiDataSource;
import com.maximo.douglas.oramaapiconsumer.service.fundservice.FundRemoteDataSource;
import com.maximo.douglas.oramaapiconsumer.service.fundservice.FundRemoteDataSourceImpl;

import static com.maximo.douglas.oramaapiconsumer.di.InjectionApiDataSourceMain.provideFundApiDataSource;

public class InjectionRemoteDataSource {

    public static FundRemoteDataSource provideFundRemoteDataSource() {
        final FundApiDataSource fundApiDataSource = provideFundApiDataSource();

        return FundRemoteDataSourceImpl.getInstance(fundApiDataSource);
    }

}
