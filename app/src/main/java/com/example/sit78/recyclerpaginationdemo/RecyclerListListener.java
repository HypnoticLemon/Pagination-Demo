package com.example.sit78.recyclerpaginationdemo;

import android.view.View;

/**
 * Created by Vikrant on 11-01-2018.
 */

public interface RecyclerListListener {
    void ItemClick(int position, String data, View view, int id);
}
