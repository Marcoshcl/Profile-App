package com.example.customprofileapp

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class PhotosViewHolder (itemView : View) : RecyclerView.ViewHolder(itemView) {

    private val imageViewPhoto : ImageView = itemView.findViewById(R.id.image_view_item_photo)
    private val textViewDescription : TextView = itemView.findViewById(R.id.
    text_view_item_curiosity_description)

    fun bind(photo:Photo) {
        Glide.with(itemView).load(photo.image).into(imageViewPhoto)
        textViewDescription.text = photo.description
    }
}