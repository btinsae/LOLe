package com.irolitech.maoo.adapters;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.irolitech.maoo.R;
import com.irolitech.maoo.fragments.Food;

/**
 * Created by btinsae on 05/08/2017.
 */

public class FoodRVAdapter extends RecyclerView.Adapter<FoodRVAdapter.FoodRVholder> {
    Context mContext;

    @Override
    public FoodRVholder onCreateViewHolder(ViewGroup parent, int viewType) {
        mContext = parent.getContext();
        View view = LayoutInflater.from(mContext).inflate(R.layout.horizontal_recycler_view, parent, false);
        return new FoodRVholder(view);
    }

    @Override
    public void onBindViewHolder(FoodRVholder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 3;
    }

    public class FoodRVholder extends RecyclerView.ViewHolder {
        public FoodRVholder(View itemView) {
            super(itemView);
            RecyclerView verticalRecyclerView = (RecyclerView) itemView.findViewById(R.id.horizontal_recycler_view);
            verticalRecyclerView.setLayoutManager(new LinearLayoutManager(mContext, LinearLayoutManager.HORIZONTAL, false));
            verticalRecyclerView.setAdapter(new VerticalRVAdapter());
        }
    }
}
