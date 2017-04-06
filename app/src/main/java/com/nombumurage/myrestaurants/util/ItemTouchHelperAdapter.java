package com.nombumurage.myrestaurants.util;

/**
 * Created by nombu on 4/3/17.
 */

public interface ItemTouchHelperAdapter {
    boolean onItemMove(int fromPosition, int toPosition);
    void onItemDismiss(int position);
}