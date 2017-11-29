package com.irolitech.lole.adapters;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.irolitech.maoo.R;

/**
 * Created by win8 on 10/14/2017.
 */

public class DrinkRVAdapter extends RecyclerView.Adapter<DrinkRVAdapter.DrinkViewHolder> {
    Context mContext;
    @Override
    public DrinkViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        mContext=parent.getContext();
        View view= LayoutInflater.from(mContext).inflate(R.layout.drink_main_recyclerview,parent,false);

        return new DrinkViewHolder(view);
    }

    @Override
    public void onBindViewHolder(DrinkViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 5;
    }

    class DrinkViewHolder extends RecyclerView.ViewHolder {
        DrinkViewHolder(View itemView) {
            super(itemView);
            RecyclerView horizontalRecyclerView = (RecyclerView) itemView.findViewById(R.id.drink_sub_menu_recycler_view);
            horizontalRecyclerView.setLayoutManager(new LinearLayoutManager(mContext, LinearLayoutManager.HORIZONTAL, false));
            horizontalRecyclerView.setAdapter(new DrinkSubMenuRecyclerViewAdapter());
        }
    }
}
