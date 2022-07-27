package com.example.wallpaper.model

import android.view.ViewGroup
import java.lang.Math.min

class columnCount {
    public fun getCount(parent: ViewGroup):Int
    {
        if (min(parent.width, parent.height) ==parent.width)
            return 2
        else
            return 3
    }
}