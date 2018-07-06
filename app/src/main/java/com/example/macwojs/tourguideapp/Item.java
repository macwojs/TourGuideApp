package com.example.macwojs.tourguideapp;

public class Item {

    private String mTitle;

    private String mOpenHour;

    private static String NO_COST = null;

    private String mCost = NO_COST;

    private String mDescription;

    private static int NO_IMAGE_SRC = -1;


    private Integer mSrc = NO_IMAGE_SRC;

    public Item(String title, String open, String cost, String desc) {
        mTitle =  title;
        mOpenHour = open;
        mCost = cost;
        mDescription = desc;
    }

    public Item(String title, String open, String desc) {
        mTitle =  title;
        mOpenHour = open;
        mDescription = desc;
    }

    public Item(String title, String open, String cost, String desc, Integer src) {
        mTitle =  title;
        mOpenHour = open;
        mCost = cost;
        mDescription = desc;
        mSrc = src;
    }

    public Item(String title, String open, String desc, Integer src) {
        mTitle =  title;
        mOpenHour = open;
        mDescription = desc;
        mSrc = src;
    }

    public String getmTitle() {
        return mTitle;
    }

    public String getmOpenHour() {
        return mOpenHour;
    }

    public String getmCost() {
        return mCost;
    }

    public String getmDescription() {
        return mDescription;
    }

    public Integer getmSrc() {
        return mSrc;
    }

    public boolean hasImage(){
        return mSrc != NO_IMAGE_SRC;
    }

    public boolean hasCost(){
        return mCost != NO_COST;
    }
}
