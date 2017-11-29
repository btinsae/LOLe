package com.irolitech.lole.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by btinsae on 05/08/2017.
 */

public class HorizontalRVAdapter extends RecyclerView.Adapter<HorizontalRVAdapter.HorizontalRVholder> {
    @Override
    public HorizontalRVholder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(HorizontalRVholder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class HorizontalRVholder extends RecyclerView.ViewHolder {


        public HorizontalRVholder(View itemView) {
            super(itemView);

        }
    }
}
