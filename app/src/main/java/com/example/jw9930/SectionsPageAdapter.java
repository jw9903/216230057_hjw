package com.example.jw9930;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 홍지우 on 2017-12-05.
 */

public class SectionsPageAdapter extends FragmentPagerAdapter {

    private final List<Fragment> mfragmentList = new ArrayList<>();
    private final List<String> mfragmentTitleList = new ArrayList<>();

    public void addFragment(Fragment fragment, String title){
        mfragmentList.add(fragment);
        mfragmentTitleList.add(title);
    }

    public SectionsPageAdapter(FragmentManager fm) {
        super(fm);
    }

    public CharSequence getPageTitle(int position) {
        return mfragmentTitleList.get(position);
    }
    @Override
    public Fragment getItem(int position) {
        return mfragmentList.get(position);
    }

    @Override
    public int getCount() {
        return mfragmentList.size();
    }
}
