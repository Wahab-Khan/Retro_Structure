package com.example.lenovo.retrovsretro.Fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.lenovo.retrovsretro.Adapter.SportPlayerAdapter;
import com.example.lenovo.retrovsretro.BaseClass.BaseFragment;
import com.example.lenovo.retrovsretro.R;

public class SportPlayerStandingFragment extends BaseFragment {

    RecyclerView playerList;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.sport_player_standing_frag,container,false);

        playerList = rootView.findViewById(R.id.player_list);

        return rootView;
    }

    @Override
    public void inits() {
        SportPlayerAdapter playerAdapter = new SportPlayerAdapter();
        playerList.setAdapter(playerAdapter);
    }

    @Override
    public void setEvents() {

    }
}
