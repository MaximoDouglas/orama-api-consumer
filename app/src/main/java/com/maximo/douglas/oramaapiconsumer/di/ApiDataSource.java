package com.maximo.douglas.oramaapiconsumer.di;

import com.google.gson.Gson;
import com.maximo.douglas.oramaapiconsumer.service.fundservice.FundApiDataSource;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiDataSource {

    private static ApiDataSource INSTANCE = null;
    private final String mBaseUrl;

    private final OkHttpClient okHttpClient = new OkHttpClient().newBuilder()
            .addInterceptor(loggingInterceptor())
            .build();

    private HttpLoggingInterceptor loggingInterceptor() {
        HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor();
        loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

        return loggingInterceptor;
    }

    private ApiDataSource(String baseUrl) {
        this.mBaseUrl = baseUrl;
    }

    public static ApiDataSource getInstance(String baseUrl) {
        if (INSTANCE == null)
            INSTANCE = new ApiDataSource(baseUrl);

        return INSTANCE;
    }

    private Retrofit buildRetrofit() {
        return new Retrofit.Builder()
                .baseUrl(mBaseUrl)
                .client(okHttpClient)
                .addConverterFactory(GsonConverterFactory.create(new Gson()))
                .build();
    }

    public FundApiDataSource fundApiDataSource() {
        return buildRetrofit().create(FundApiDataSource.class);
    }

}
