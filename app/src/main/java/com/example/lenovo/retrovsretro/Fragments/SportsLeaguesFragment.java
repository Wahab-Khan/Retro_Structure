package com.example.lenovo.retrovsretro.Fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.lenovo.retrovsretro.Adapter.SportAdapter;
import com.example.lenovo.retrovsretro.BaseClass.BaseFragment;
import com.example.lenovo.retrovsretro.R;

public class SportsLeaguesFragment extends BaseFragment{

    ViewPager sportPager;
    TabLayout tabs;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.sports_leagues_fragment,container,false);
        sportPager = rootView.findViewById(R.id.viewPager);
        tabs = rootView.findViewById(R.id.tabs);
        return rootView;
    }

    @Override
    public void inits() {
        SportAdapter adapter = new SportAdapter(getFragmentManager(),getContext());
        tabs.setupWithViewPager(sportPager);
        sportPager.setAdapter(adapter);
    }

    @Override
    public void setEvents() {

    }
}
