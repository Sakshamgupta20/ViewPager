package com.example.saksham.viewpager;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class FragmentPage extends FragmentPagerAdapter {
    private Context mContext;
    public FragmentPage(Context context,FragmentManager fm) {
        super(fm);
        mContext=context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new Saunack();
        }
        else
        {
            return new PunyaSlock();
        }
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return "Saunack";
        }
        else
        {
            return "Punyaslock";
        }
    }
}

