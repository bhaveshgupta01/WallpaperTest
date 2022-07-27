package com.example.wallpaper.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.ImageView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.wallpaper.PreviewActivity
import com.example.wallpaper.model.Images
import com.example.wallpaper.R
import com.example.wallpaper.model.columnCount


class ItemAdapter(
    private val context: Context,
    private val dataset: List<Images>
    ):
    RecyclerView.Adapter<ItemAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val margin=5;
        val view = LayoutInflater.from(context).inflate(R.layout.card_frame, parent, false)
        val layoutParam= view.findViewById<CardView>(R.id.CardViewPkt).layoutParams as ViewGroup.MarginLayoutParams
        layoutParam.height=parent.height/columnCount().getCount(parent)
        layoutParam.setMargins(margin, margin, margin, margin)

        return ViewHolder(view)
    }

    override fun getItemCount()= dataset.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = dataset[position]

        holder.bind(position)

        holder.imageButton.setOnClickListener {
            val context = holder.view.context
            val intent = Intent(context, PreviewActivity::class.java)
            intent.putExtra("letter", dataset[position].ImageResourceId)
//            intent.putExtra("letter", holder.imageButton.id)
            context.startActivity(intent)
        }
    }

    inner class ViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
        val imageButton: ImageView = view.findViewById<ImageButton>(R.id.image_Button)

        fun bind(position: Int)
        {
            imageButton.setImageResource(dataset[position].ImageResourceId)

        }
    }
}
