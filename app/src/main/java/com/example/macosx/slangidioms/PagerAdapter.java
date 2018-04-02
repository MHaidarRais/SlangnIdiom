package com.example.macosx.slangidioms;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by Hoidar on 3/31/18.
 */

public class PagerAdapter extends FragmentStatePagerAdapter {

    int mNoOfTab;
    public PagerAdapter(FragmentManager fm, int NumberOfTabs) {
        super(fm);
        this.mNoOfTab = NumberOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position){
            case 0 :
                TabIdiom tabIdiom = new TabIdiom();
                return tabIdiom;
            case 1 :
                TabSlang tabSlang = new TabSlang();
                return tabSlang;

                default:
                    return null;
        }


    }

    @Override
    public int getCount() {
        return mNoOfTab;
    }
}
