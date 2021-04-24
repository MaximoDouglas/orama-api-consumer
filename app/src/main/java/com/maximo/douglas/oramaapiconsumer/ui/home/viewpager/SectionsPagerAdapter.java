package com.maximo.douglas.oramaapiconsumer.ui.home.viewpager;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.maximo.douglas.oramaapiconsumer.ui.home.viewpager.fundlisting.FundListingFragment;
import com.maximo.douglas.oramaapiconsumer.ui.home.viewpager.temp.TempFragment;

public class SectionsPagerAdapter extends FragmentPagerAdapter {

    private static final Fragment[] fragmentList = {
            FundListingFragment.newInstance(),
            TempFragment.newInstance(1)
    };

    public SectionsPagerAdapter(FragmentManager fragmentManager) {
        super(fragmentManager, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentList[position];
    }

    @Override
    public int getCount() {
        return fragmentList.length;
    }
}