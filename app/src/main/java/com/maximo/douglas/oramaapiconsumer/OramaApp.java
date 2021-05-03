package com.maximo.douglas.oramaapiconsumer;

import android.app.Application;

import com.maximo.douglas.oramaapiconsumer.di.ApplicationComponent;
import com.maximo.douglas.oramaapiconsumer.di.DaggerApplicationComponent;

public class OramaApp extends Application {

    ApplicationComponent applicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        applicationComponent = DaggerApplicationComponent.factory().create(this);
    }

    public ApplicationComponent getApplicationComponent() {
        return applicationComponent;
    }
}