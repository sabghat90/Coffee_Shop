package com.sabghat.coffeeshop;

public class ItemModelClass {

    private int itemImage;
    private String tvItemName, tvItemDescription;

    public ItemModelClass(int itemImage, String tvItemName, String tvItemDescription) {
        this.itemImage = itemImage;
        this.tvItemName = tvItemName;
        this.tvItemDescription = tvItemDescription;
    }

    public int getItemImage() {
        return itemImage;
    }

    public String getTvItemName() {
        return tvItemName;
    }

    public String getTvItemDescription() {
        return tvItemDescription;
    }
}
