package com.example.org29cm_android.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.widget.AppCompatImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.org29cm_android.R
import com.example.org29cm_android.data.domain.HomeWomanItemData

/**
 * Created by SSong-develop by 2020-12-01
 */
class HomeWomanAdapter : RecyclerView.Adapter<HomeWomanAdapter.VHolder>() {
    var homeWomanItemList = mutableListOf<HomeWomanItemData>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = VHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.item_list_home_woman, parent, false)
    )

    override fun onBindViewHolder(holder: VHolder, position: Int) {
        holder.bind(homeWomanItemList[position])
    }

    override fun getItemCount(): Int = homeWomanItemList.size

    inner class VHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind(homeWomanItemData: HomeWomanItemData) {
            itemView.findViewById<TextView>(R.id.item_title_home_woman).text =
                homeWomanItemData.itemTitle
            itemView.findViewById<TextView>(R.id.item_subtitle_home_woman).text =
                homeWomanItemData.itemSubTitle
            itemView.findViewById<TextView>(R.id.item_price_home_woman).text =
                homeWomanItemData.itemPrice
            itemView.findViewById<AppCompatImageView>(R.id.image_view_home_woman).setBackgroundResource(homeWomanItemData.itemImage)
            itemView.findViewById<AppCompatImageView>(R.id.item_like_home_woman).setBackgroundResource(homeWomanItemData.itemLikeImage)
            itemView.findViewById<TextView>(R.id.item_like_count_home_woman).text=
                homeWomanItemData.itemLikeCount.toString()
        }

    }
}