package com.example.lenovo.retrovsretro.Adapter;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.lenovo.retrovsretro.Fragments.SportPlayerStandingFragment;
import com.example.lenovo.retrovsretro.Fragments.SportTeamStandingFragment;
import com.example.lenovo.retrovsretro.R;

public class SportAdapter extends FragmentPagerAdapter{

    Context context;

    public SportAdapter(FragmentManager fm,Context context) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new SportPlayerStandingFragment();
            case 1:
                return new SportTeamStandingFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return context.getString(R.string.firstFrag);
            case 1:
                return context.getString(R.string.secFrag);
            default:
                return null;
        }
    }
}
