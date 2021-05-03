package com.maximo.douglas.oramaapiconsumer.testutils;

import androidx.fragment.app.Fragment;

import com.maximo.douglas.oramaapiconsumer.R;
import com.maximo.douglas.oramaapiconsumer.ui.MainActivity;

public class FakeActivity extends MainActivity {

    public void replaceFragment(Fragment fragment) {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.main_activity_constraint_layout, fragment)
                .commit();
    }

}
