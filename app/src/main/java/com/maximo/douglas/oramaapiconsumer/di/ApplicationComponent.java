package com.maximo.douglas.oramaapiconsumer.di;

import android.content.Context;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;

@Singleton
@Component(modules = {RepositoryModule.class})
public interface ApplicationComponent {

    @Component.Factory
    interface Factory {
        ApplicationComponent create(@BindsInstance Context applicationContext);
    }

}
