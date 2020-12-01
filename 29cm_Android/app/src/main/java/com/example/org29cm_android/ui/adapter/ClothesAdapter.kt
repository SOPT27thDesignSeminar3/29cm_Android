package com.example.org29cm_android.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.org29cm_android.R
import com.example.org29cm_android.data.ClothesData

class ClothesAdapter : RecyclerView.Adapter<ClothesAdapter.VHolder>(){
    var clothesList = mutableListOf<ClothesData>()

    override fun onCreateViewHolder(parent : ViewGroup, viewType : Int)
            = VHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_clothes, parent, false))

    override fun getItemCount() = clothesList.size

    override fun onBindViewHolder(holder: VHolder, position: Int) {
        holder.bind(clothesList[position])
    }

    inner class VHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {

        fun bind(clothes : ClothesData){
            itemView.findViewById<TextView>(R.id.tv_name).text = clothes.name
            itemView.findViewById<TextView>(R.id.tv_content).text = clothes.content
            itemView.findViewById<ImageView>(R.id.img_item).setBackgroundResource(clothes.image)
        }
    }
}