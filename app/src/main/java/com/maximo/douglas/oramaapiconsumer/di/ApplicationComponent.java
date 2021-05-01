package com.maximo.douglas.oramaapiconsumer.di;

import android.content.Context;

import com.maximo.douglas.oramaapiconsumer.di.ViewModelFactory.ViewModelFactoryModule;
import com.maximo.douglas.oramaapiconsumer.ui.di.MainComponent;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.Module;

@Singleton
@Component(modules = {
        RepositoryModule.class,
        ViewModelFactoryModule.class,
        SubComponentsModule.class,
        ServiceModule.class
})
public interface ApplicationComponent {

    @Component.Factory
    interface Factory {
        ApplicationComponent create(@BindsInstance Context applicationContext);
    }

    MainComponent.Factory mainComponent();

}

@Module(subcomponents = {MainComponent.class})
class SubComponentsModule {
}