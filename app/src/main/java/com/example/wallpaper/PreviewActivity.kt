package com.example.wallpaper

import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class PreviewActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.preview)

        var resId : Int
        val imageButton: ImageView = findViewById(R.id.imageView)

        val bundle = intent.extras
        if (bundle != null) {
            resId = bundle.getInt("letter")
        }
        else resId = R.drawable.ic_launcher_background

        imageButton.setImageResource(resId)


//        val ResId = intent?.extras.getInt("letter")
//        val imageButton: ImageView = view.findViewById<ImageButton>(R.id.image_Button)
//        imageButton.setImageResource(ResId)
    }
}