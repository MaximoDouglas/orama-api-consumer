package com.maximo.douglas.oramaapiconsumer.di;

import com.maximo.douglas.oramaapiconsumer.domain.repository.fund.FundRepository;
import com.maximo.douglas.oramaapiconsumer.domain.repository.fund.FundRepositoryImpl;

import javax.inject.Singleton;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class RepositoryModule {

    @Singleton
    @Binds
    abstract FundRepository provideFundRepository(FundRepositoryImpl fundRepository);

}
