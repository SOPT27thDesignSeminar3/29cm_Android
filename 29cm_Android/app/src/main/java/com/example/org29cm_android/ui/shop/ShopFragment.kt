package com.example.org29cm_android.ui.shop

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.org29cm_android.R
import com.example.org29cm_android.data.ClothesData
import com.example.org29cm_android.ui.adapter.ClothesAdapter
import kotlinx.android.synthetic.main.fragment_shop.*

class ShopFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_shop, container, false)
    }

    override fun onStart() {
        super.onStart()

        val clothesAdapter = ClothesAdapter()
        rv_clothes.adapter = clothesAdapter

        clothesAdapter.clothesList = mutableListOf(
            ClothesData(R.drawable.img_2, "킨더살몬", "[FW20 ESSENTIAL] 캐시미어 Cashmere Single Coat Wood-brown"),
            ClothesData(R.drawable.img_2, "킨더살몬", "[FW20 ESSENTIAL] 캐시미어 Cashmere Single Coat Wood-brown"),
            ClothesData(R.drawable.img_2, "킨더살몬", "[FW20 ESSENTIAL] 캐시미어 Cashmere Single Coat Wood-brown"),
            ClothesData(R.drawable.img_2, "킨더살몬", "[FW20 ESSENTIAL] 캐시미어 Cashmere Single Coat Wood-brown")
        )
        clothesAdapter.notifyDataSetChanged()
    }
}