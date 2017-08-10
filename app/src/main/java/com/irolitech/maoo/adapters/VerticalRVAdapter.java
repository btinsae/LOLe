package com.irolitech.maoo.adapters;

import android.content.Context;
import android.support.v7.widget.AppCompatImageView;
import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RatingBar;

import com.irolitech.maoo.R;

/**
 * Created by btinsae on 05/08/2017.
 */

public class VerticalRVAdapter extends RecyclerView.Adapter<VerticalRVAdapter.VerticalRVholder> {
    Context mContext;

    @Override
    public VerticalRVholder onCreateViewHolder(ViewGroup parent, int viewType) {
        mContext = parent.getContext();
        View view = LayoutInflater.from(mContext).inflate(R.layout.reorder_card, parent, false);
        return new VerticalRVholder(view);

    }

    @Override
    public void onBindViewHolder(VerticalRVholder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 5;
    }

    class VerticalRVholder extends RecyclerView.ViewHolder {
        //        AppCompatTextView serviceProviderName, ratingCount, deliveryFee, minPrice, serviceProviderSpecialItems,
//                price, estimatedTimeArrival, distanceBetween;
//        RatingBar ratingBar;
//        AppCompatImageView serviceProviderThumbnail;
        CardView cardView;

        public VerticalRVholder(View itemView) {
            super(itemView);
            itemView.findViewById(R.id.reorder_card_view);
//            serviceProviderName = (AppCompatTextView) itemView.findViewById(R.id.service_provider_name);
//            ratingCount = (AppCompatTextView) itemView.findViewById(R.id.rating_count);
//            deliveryFee = (AppCompatTextView) itemView.findViewById(R.id.delivery_fee);
//            minPrice = (AppCompatTextView) itemView.findViewById(R.id.minimum_price);
//            serviceProviderSpecialItems = (AppCompatTextView) itemView.findViewById(R.id.service_provider_special_items);
//            price = (AppCompatTextView) itemView.findViewById(R.id.average_price);
//            estimatedTimeArrival = (AppCompatTextView) itemView.findViewById(R.id.eta);
//            distanceBetween = (AppCompatTextView) itemView.findViewById(R.id.distance_between);
//            ratingBar = (RatingBar) itemView.findViewById(R.id.ratingBar);
//            serviceProviderThumbnail = (AppCompatImageView) itemView.findViewById(R.id.service_provider_thumbnail);
        }
    }
}
