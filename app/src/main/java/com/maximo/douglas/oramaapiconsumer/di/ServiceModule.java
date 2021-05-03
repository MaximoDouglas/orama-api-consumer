package com.maximo.douglas.oramaapiconsumer.di;

import com.google.gson.Gson;
import com.maximo.douglas.oramaapiconsumer.service.fundservice.FundApiDataSource;
import com.maximo.douglas.oramaapiconsumer.service.fundservice.FundRemoteDataSource;
import com.maximo.douglas.oramaapiconsumer.service.fundservice.FundRemoteDataSourceImpl;

import javax.inject.Singleton;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import static com.maximo.douglas.oramaapiconsumer.BuildConfig.BASE_URL;

@Module
public abstract class ServiceModule {

    @Singleton
    @Binds
    abstract FundRemoteDataSource provideFundRemoteDataSource(FundRemoteDataSourceImpl fundRemoteDataSource);

    @Singleton
    @Provides
    static FundRemoteDataSourceImpl provideFundRemoteDataSourceImpl(FundApiDataSource fundApiDataSource) {
        return new FundRemoteDataSourceImpl(fundApiDataSource);
    }

    @Singleton
    @Provides
    static FundApiDataSource provideFundApiDataSource(Retrofit retrofit) {
        return retrofit.create(FundApiDataSource.class);
    }

    @Singleton
    @Provides
    static Retrofit provideRetrofit(OkHttpClient okHttpClient) {
        return new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .client(okHttpClient)
                .addConverterFactory(GsonConverterFactory.create(new Gson()))
                .build();
    }

    @Singleton
    @Provides
    static OkHttpClient provideOkHttpClient(HttpLoggingInterceptor loggingInterceptor) {
        return new OkHttpClient().newBuilder()
                .addInterceptor(loggingInterceptor)
                .build();
    }

    @Singleton
    @Provides
    static HttpLoggingInterceptor provideLoggingInterceptor() {
        HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor();
        loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

        return loggingInterceptor;
    }

}
