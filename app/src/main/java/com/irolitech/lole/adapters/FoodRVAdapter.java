package com.irolitech.lole.adapters;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.irolitech.maoo.R;


/**
 * Created by btinsae on 05/08/2017.
 */

public class FoodRVAdapter extends RecyclerView.Adapter<FoodRVAdapter.FoodRVHolder> {
    Context mContext;

    @Override
    public FoodRVHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        mContext = parent.getContext();
        View view = LayoutInflater.from(mContext).inflate(R.layout.food_main_recyclerview, parent, false);
        return new FoodRVHolder(view);
    }

    @Override
    public void onBindViewHolder(FoodRVHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 3;
    }

    public class FoodRVHolder extends RecyclerView.ViewHolder {
        public FoodRVHolder(View itemView) {
            super(itemView);
            RecyclerView horizontalRecyclerView = (RecyclerView) itemView.findViewById(R.id.food_sub_menu_recycler_view);
            horizontalRecyclerView.setLayoutManager(new LinearLayoutManager(mContext, LinearLayoutManager.HORIZONTAL, false));
            horizontalRecyclerView.setAdapter(new FoodSubMenuRecyclerViewAdapter());
        }
    }
}
