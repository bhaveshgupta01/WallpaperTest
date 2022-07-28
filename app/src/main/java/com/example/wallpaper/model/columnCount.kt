package com.example.wallpaper.model

import java.lang.Math.min

class columnCount {
    public fun getCount(height: Int, width: Int):Int
    {

        if (min(width, height) ==width)
            return 2
        else
            return 3
    }
}
