package com.nombumurage.myrestaurants;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.widget.ArrayAdapter;

/**
 * Created by nombu on 3/14/17.
 */

public class MyRestaurantsArrayAdapter extends ArrayAdapter{
    private Context mContext;
    private String[] mRestaurants;
    private String[] mCuisines;

    public MyRestaurantsArrayAdapter(Context mContext, int resource, String[] mRestaurants, String[] mCuisines) {
        super(mContext, resource);
        this.mContext = mContext;
        this.mRestaurants = mRestaurants;
        this.mCuisines = mCuisines;
    }
    @Override
    public Object getItem(int position) {
        String restaurant = mRestaurants[position];
        String cuisine = mCuisines[position];
        return String.format("%s \nServes great: %s", restaurant, cuisine);
    }

    @Override
    public int getCount() {
        return mRestaurants.length;
    }

}
