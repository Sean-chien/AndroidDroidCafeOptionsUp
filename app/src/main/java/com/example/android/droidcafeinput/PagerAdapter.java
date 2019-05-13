package com.example.android.droidcafeinput;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class PagerAdapter extends FragmentStatePagerAdapter {
    public PagerAdapter(FragmentManager fm, int mNumOftabs) {
        super(fm);
        this.mNumOftabs = mNumOftabs;
    }

    int mNumOftabs;

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0: return new TabFragment1();
            case 1: return new TabFragment2();
            case 2: return new TabFragment3();
            default: return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOftabs;
    }
}
