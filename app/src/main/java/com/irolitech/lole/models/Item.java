package com.irolitech.lole.models;

/**
 * Created by btinsae on 14/07/2017.
 */

public class Item {
    String name, type, desc;
    float price;

    public Item(String name, String type, String desc, float price) {
        this.name = name;
        this.type = type;
        this.desc = desc;
        this.price = price;
    }
}
