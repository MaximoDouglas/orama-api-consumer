package com.maximo.douglas.oramaapiconsumer.ui;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.maximo.douglas.oramaapiconsumer.OramaApp;
import com.maximo.douglas.oramaapiconsumer.R;
import com.maximo.douglas.oramaapiconsumer.ui.di.MainComponent;

public class MainActivity extends AppCompatActivity {

    MainComponent mainComponent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        mainComponent = ((OramaApp) getApplicationContext())
                .getApplicationComponent().mainComponent().create();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public MainComponent getMainComponent() {
        return mainComponent;
    }

}