package com.example.lenovo.retrovsretro.Adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.lenovo.retrovsretro.R;

public class SportPlayerAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    @NonNull
    @Override
    public SportPlayerAdapter.SportPlayerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.player_item,parent,false);
        return new SportPlayerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }


    private class SportPlayerViewHolder extends RecyclerView.ViewHolder{

        public SportPlayerViewHolder(View itemView) {
            super(itemView);
        }
    }
}
