package com.example.customprofileapp

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CuriosityViewHolder (itemView : View) : RecyclerView.ViewHolder(itemView) {

    private val textViewTitle : TextView = itemView.findViewById(R.id.
    text_view_item_curiosity_title)
    private val textViewDescription : TextView = itemView.findViewById(R.id.
    text_view_item_curiosity_description)

    fun bind(curiosity:Curiosity) {
        textViewTitle.text = curiosity.title
        textViewDescription.text = curiosity.description
    }

}