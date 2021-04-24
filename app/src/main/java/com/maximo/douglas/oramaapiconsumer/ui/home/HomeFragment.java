package com.maximo.douglas.oramaapiconsumer.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.snackbar.Snackbar;
import com.maximo.douglas.oramaapiconsumer.R;
import com.maximo.douglas.oramaapiconsumer.databinding.FragmentHomeBinding;
import com.maximo.douglas.oramaapiconsumer.ui.home.viewpager.SectionsPagerAdapter;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding mBinding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false);
        return mBinding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(getParentFragmentManager());

        ViewPager viewPager = mBinding.viewPager;

        viewPager.setAdapter(sectionsPagerAdapter);
        mBinding.tabs.setupWithViewPager(viewPager);

        mBinding.fab.setOnClickListener(it ->
                Snackbar.make(it, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show()
        );
    }
}
