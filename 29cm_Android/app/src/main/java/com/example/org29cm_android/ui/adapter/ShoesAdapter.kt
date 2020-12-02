package com.example.org29cm_android.ui.adapter

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.org29cm_android.data.domain.ShoesData
import com.example.org29cm_android.databinding.ItemShoesBinding

class ShoesAdapter : RecyclerView.Adapter<ShoesAdapter.ViewHolder>() {

    private var _data = mutableListOf<ShoesData>()
    var data: List<ShoesData> = _data
        set(value) {
            _data.clear()
            _data.addAll(value)
            notifyDataSetChanged()
        }

    inner class ViewHolder(private val binding: ItemShoesBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(item: ShoesData) {
            binding.item = item
        }
        fun onClick() {
            binding.btnHeart.setOnClickListener {

                it.isSelected = !it.isSelected
                Log.e("SEULGI", "btnHeart:"+it.isSelected)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemShoesBinding.inflate(inflater, parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int = _data.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(_data[position])
        holder.onClick()
    }

}