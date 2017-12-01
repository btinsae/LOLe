package com.irolitech.lole.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.irolitech.maoo.R;

/**
 * Created by win8 on 10/14/2017.
 */

public class DrinkSubMenuRecyclerViewAdapter extends RecyclerView.Adapter<DrinkSubMenuRecyclerViewAdapter.DrinkSubMenuRVHolder> {

    @Override
    public DrinkSubMenuRVHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.drink_item_card, parent, false);
        return new DrinkSubMenuRVHolder(view);
    }

    @Override
    public void onBindViewHolder(DrinkSubMenuRVHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 5;
    }

    class DrinkSubMenuRVHolder extends RecyclerView.ViewHolder {
        DrinkSubMenuRVHolder(View itemView) {
            super(itemView);
        }
    }
}
