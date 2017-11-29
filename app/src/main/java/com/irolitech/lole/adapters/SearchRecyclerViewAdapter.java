package com.irolitech.lole.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import com.irolitech.lole.models.Item;
import com.irolitech.maoo.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by btinsae on 14/07/2017.
 */

public class SearchRecyclerViewAdapter extends RecyclerView.Adapter<SearchRecyclerViewAdapter.SearchRecyclerViewHolder> {
    List<Item> items = new ArrayList<>();
    private Context mContext;

    public SearchRecyclerViewAdapter(List<Item> items, Context mContext) {
        this.items = items;
        this.mContext = mContext;
    }

    @Override
    public SearchRecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.search_result_item, parent, false);
        return new SearchRecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(SearchRecyclerViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    class SearchRecyclerViewHolder extends RecyclerView.ViewHolder {
        TextView itemName, itemCuisine, itemRating, itemPrice, itemETA;

        public SearchRecyclerViewHolder(View itemView) {
            super(itemView);
            itemName = (TextView) itemView.findViewById(R.id.item_name);
            itemCuisine = (TextView) itemView.findViewById(R.id.item_cuisine);
            itemRating = (TextView) itemView.findViewById(R.id.item_rating);
            itemPrice = (TextView) itemView.findViewById(R.id.item_price);
            itemETA = (TextView) itemView.findViewById(R.id.item_ETA);
        }
    }
}
