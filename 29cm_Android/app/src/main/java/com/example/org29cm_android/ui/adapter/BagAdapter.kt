package com.example.org29cm_android.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.org29cm_android.data.domain.BagData
import com.example.org29cm_android.databinding.ItemBagBinding

/**
 * Created by 4z7l on 2020-12-02
 */
class BagAdapter : RecyclerView.Adapter<BagAdapter.ViewHolder>() {

    private var _data = mutableListOf<BagData>()
    var data: List<BagData> = _data
        set(value) {
            _data.clear()
            _data.addAll(value)
            notifyDataSetChanged()
        }

    inner class ViewHolder(private val binding: ItemBagBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(item: BagData) {
            binding.item = item
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemBagBinding.inflate(inflater, parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int = _data.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(_data[position])
    }

}