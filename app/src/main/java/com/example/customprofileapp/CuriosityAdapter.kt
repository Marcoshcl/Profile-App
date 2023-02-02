package com.example.customprofileapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class CuriosityAdapter : RecyclerView.Adapter<CuriosityViewHolder>() {

    private val items : MutableList<Curiosity> = getUser().curiosities

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CuriosityViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_curiosity, parent,
            false)
        return CuriosityViewHolder(view)
    }

    override fun onBindViewHolder(holder: CuriosityViewHolder, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount(): Int {
        return items.size
    }

}