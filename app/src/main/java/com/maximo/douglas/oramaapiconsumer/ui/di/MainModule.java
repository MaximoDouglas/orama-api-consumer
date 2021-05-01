package com.maximo.douglas.oramaapiconsumer.ui.di;

import androidx.lifecycle.ViewModel;

import com.maximo.douglas.oramaapiconsumer.di.ViewModelFactory;
import com.maximo.douglas.oramaapiconsumer.ui.fundlisting.FundListingViewModel;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

@Module
public abstract class MainModule {

    @Binds
    @IntoMap
    @ViewModelFactory.ViewModelKey(FundListingViewModel.class)
    abstract ViewModel bindFundListingViewModel(FundListingViewModel fundListingViewModel);
}
