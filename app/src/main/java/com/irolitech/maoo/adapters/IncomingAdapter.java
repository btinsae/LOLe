package com.irolitech.maoo.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.irolitech.maoo.R;


/**
 * Created by btinsae on 26/07/2017.
 */

public class IncomingAdapter extends RecyclerView.Adapter<IncomingAdapter.IncomingViewHolder> {
    private Context mContext;

    public IncomingAdapter(Context context) {
        this.mContext = context;
    }

    @Override
    public IncomingViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.incoming_card, parent, false);

        return new IncomingViewHolder(view);
    }

    @Override
    public void onBindViewHolder(IncomingViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 5;
    }

    class IncomingViewHolder extends RecyclerView.ViewHolder {
        public IncomingViewHolder(View itemView) {
            super(itemView);
        }
    }
}
