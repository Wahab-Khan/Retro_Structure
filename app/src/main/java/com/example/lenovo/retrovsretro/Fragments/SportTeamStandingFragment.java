package com.example.lenovo.retrovsretro.Fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.lenovo.retrovsretro.Adapter.SportTeamAdapter;
import com.example.lenovo.retrovsretro.BaseClass.BaseFragment;
import com.example.lenovo.retrovsretro.R;

public class SportTeamStandingFragment extends BaseFragment {

    RecyclerView TeamList;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.sport_team_standing_frag,container,false);

        TeamList = rootView.findViewById(R.id.team_list);
        return rootView;
    }

    @Override
    public void inits() {
        SportTeamAdapter sportAdapter = new SportTeamAdapter();
        TeamList.setAdapter(sportAdapter);
    }

    @Override
    public void setEvents() {

    }
}
