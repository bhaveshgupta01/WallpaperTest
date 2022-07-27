package com.example.wallpaper.data

import com.example.wallpaper.R
import com.example.wallpaper.model.Images

class DataSource {
    fun loadImages(): List <Images>
    {
        return listOf<Images>(
            Images(R.drawable.img01),
            Images(R.drawable.img02),
            Images(R.drawable.img03),
            Images(R.drawable.img04),
            Images(R.drawable.img05),
            Images(R.drawable.img06),
            Images(R.drawable.img07),
            Images(R.drawable.img08),
            Images(R.drawable.img09),
            Images(R.drawable.img10),
            Images(R.drawable.img11),
            Images(R.drawable.img12),
            Images(R.drawable.img13),
            Images(R.drawable.img14),
            Images(R.drawable.img15),
            Images(R.drawable.img16),
            Images(R.drawable.img17),
            Images(R.drawable.img18),
            Images(R.drawable.img19),
            Images(R.drawable.img20)
        )
    }
}