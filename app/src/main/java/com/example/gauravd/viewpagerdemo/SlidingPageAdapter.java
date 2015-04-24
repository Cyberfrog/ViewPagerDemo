package com.example.gauravd.viewpagerdemo;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.view.View;

/**
 * Created by gauravd on 24/04/15.
 */
public class SlidingPageAdapter extends FragmentStatePagerAdapter{


    public SlidingPageAdapter(FragmentManager supportFragmentManager) {
        super(supportFragmentManager);
    }

    @Override
    public int getCount() {
        return ScreenSider.NUM_PAGE;
    }

    @Override
    public Fragment getItem(int i) {

        screenSlidePage screenSlidePage = new screenSlidePage();
        Bundle bundle = new Bundle();
       bundle.putInt("Stage",i);
        screenSlidePage.setArguments(bundle);
        return  screenSlidePage;
    }


}
