package com.irolitech.lole.network;

import com.irolitech.lole.models.Item;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by win8 on 8/25/2017.
 */

public interface ItemApi {
    @GET("item/type/{type}")
    Call<List<Item>> getItemByType(@Path("type") String type);
}
