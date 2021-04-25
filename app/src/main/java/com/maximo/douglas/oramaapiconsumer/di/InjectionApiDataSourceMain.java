package com.maximo.douglas.oramaapiconsumer.di;

import com.maximo.douglas.oramaapiconsumer.service.fundservice.FundApiDataSource;

import static com.maximo.douglas.oramaapiconsumer.BuildConfig.BASE_URL;

public class InjectionApiDataSourceMain {

    private static ApiDataSource provideApiDataSource() {
        return ApiDataSource.getInstance(BASE_URL);
    }

    public static FundApiDataSource provideFundApiDataSource() {
        return provideApiDataSource().fundApiDataSource();
    }
}
