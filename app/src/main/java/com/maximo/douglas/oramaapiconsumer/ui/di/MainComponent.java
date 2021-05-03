package com.maximo.douglas.oramaapiconsumer.ui.di;

import com.maximo.douglas.oramaapiconsumer.ui.MainActivity;
import com.maximo.douglas.oramaapiconsumer.ui.funddetail.FundDetailFragment;
import com.maximo.douglas.oramaapiconsumer.ui.fundlisting.FundListingFragment;

import dagger.Subcomponent;

@Subcomponent(modules = {MainModule.class})
public interface MainComponent {

    @Subcomponent.Factory
    interface Factory {
        MainComponent create();
    }

    void inject(MainActivity mainActivity);

    void inject(FundListingFragment fundListingFragment);

    void inject(FundDetailFragment fundDetailFragment);

}
