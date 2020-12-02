package com.example.org29cm_android.ui.shop

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.org29cm_android.R
import com.example.org29cm_android.data.domain.BagData
import com.example.org29cm_android.data.domain.ClothesData
import com.example.org29cm_android.data.domain.ShoesData
import com.example.org29cm_android.databinding.FragmentShopBinding
import com.example.org29cm_android.ui.adapter.BagAdapter
import com.example.org29cm_android.ui.adapter.ClothesAdapter
import com.example.org29cm_android.ui.adapter.ShoesAdapter

class ShopFragment : Fragment() {

    private lateinit var binding: FragmentShopBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_shop, container, false)

        initClothesRecycler()
        initBagRecycler()
        initShoesRecycler()

        return binding.root
    }

    private fun initClothesRecycler() {
        val clothesAdapter = ClothesAdapter()
        binding.rvClothes.adapter = clothesAdapter

        clothesAdapter.clothesList = mutableListOf(
            ClothesData(
                R.drawable.img_2,
                "킨더살몬",
                "[FW20 ESSENTIAL] 캐시미어 Cashmere Single Coat Wood-brown"
            ),
            ClothesData(
                R.drawable.img_2,
                "킨더살몬",
                "[FW20 ESSENTIAL] 캐시미어 Cashmere Single Coat Wood-brown"
            ),
            ClothesData(
                R.drawable.img_2,
                "킨더살몬",
                "[FW20 ESSENTIAL] 캐시미어 Cashmere Single Coat Wood-brown"
            ),
            ClothesData(
                R.drawable.img_2,
                "킨더살몬",
                "[FW20 ESSENTIAL] 캐시미어 Cashmere Single Coat Wood-brown"
            )
        )
        clothesAdapter.notifyDataSetChanged()
    }

    private fun initBagRecycler() {
        val bagAdapter = BagAdapter()
        binding.rvBag.apply {
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
            adapter = bagAdapter
            setHasFixedSize(true)
        }
        bagAdapter.data = mutableListOf(
            BagData(
                "",
                "",
                R.drawable.product_title_3,
                false
            ),
            BagData(
                "",
                "",
                R.drawable.product_title_3,
                false
            ),
            BagData(
                "",
                "",
                R.drawable.product_title_3,
                false
            ),
            BagData(
                "",
                "",
                R.drawable.product_title_3,
                false
            )
        )
    }

    private fun initShoesRecycler() {
        val shoesAdapter = ShoesAdapter()
        binding.rvShoes.apply {
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
            adapter = shoesAdapter
            setHasFixedSize(true)
        }
        shoesAdapter.data = mutableListOf(
            ShoesData(
                "타크트로이메",
                "Solar-01-베이직 슬림 앵클 부츠",
                43,
                59000,
                R.drawable.img_4,
                false
            ),
            ShoesData(
                "타크트로이메",
                "Solar-01-베이직 슬림 앵클 부츠",
                43,
                59000,
                R.drawable.img_4,
                true
            ),
            ShoesData(
                "타크트로이메",
                "Solar-01-베이직 슬림 앵클 부츠",
                43,
                59000,
                R.drawable.img_4,
                false
            ),
            ShoesData(
                "타크트로이메",
                "Solar-01-베이직 슬림 앵클 부츠",
                43,
                59000,
                R.drawable.img_4,
                true
            )
        )
    }

}