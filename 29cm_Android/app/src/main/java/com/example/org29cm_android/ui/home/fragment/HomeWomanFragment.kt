package com.example.org29cm_android.ui.home.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.org29cm_android.R
import com.example.org29cm_android.data.domain.HomeWomanItemData
import com.example.org29cm_android.databinding.FragmentHomeWomanBinding
import com.example.org29cm_android.ui.adapter.HomeWomanAdapter

/**
 * Created by SSong-develop on 2020-12-01
 */
class HomeWomanFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding: FragmentHomeWomanBinding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_home_woman, container, false)
        val homeWomanAdapter = HomeWomanAdapter()
        makeDummy(homeWomanAdapter)
        setAdapter(binding, homeWomanAdapter)
        return binding.root
    }

    private fun setAdapter(binding: FragmentHomeWomanBinding, homeWomanAdapter: HomeWomanAdapter) {
        binding.recyclerviewHomeWoman.apply {
            layoutManager = LinearLayoutManager(requireContext())
            adapter = homeWomanAdapter
            addItemDecoration(DividerItemDecoration(requireContext(), LinearLayoutManager.VERTICAL))
        }
    }

    private fun makeDummy(homeWomanAdapter: HomeWomanAdapter) {
        homeWomanAdapter.homeWomanItemList = mutableListOf(
            HomeWomanItemData(
                R.drawable.img_home_woman,
                "킨더살몬",
                "[FW20 ESSENTIAL] 캐시미어 Cashmere Single Coat Wood - brown",
                "9% 268,945won",
                R.drawable.ic_heart_red,
                79
            ),
            HomeWomanItemData(
                R.drawable.img_home_woman,
                "킨더살몬",
                "[FW20 ESSENTIAL] 캐시미어 Cashmere Single Coat Wood - brown",
                "9% 268,945won",
                R.drawable.ic_heart_red,
                79
            ),
            HomeWomanItemData(
                R.drawable.img_home_woman,
                "킨더살몬",
                "[FW20 ESSENTIAL] 캐시미어 Cashmere Single Coat Wood - brown",
                "9% 268,945won",
                R.drawable.ic_heart_red,
                79
            ),
            HomeWomanItemData(
                R.drawable.img_home_woman,
                "킨더살몬",
                "[FW20 ESSENTIAL] 캐시미어 Cashmere Single Coat Wood - brown",
                "9% 268,945won",
                R.drawable.ic_heart_red,
                79
            ),
            HomeWomanItemData(
                R.drawable.img_home_woman,
                "킨더살몬",
                "[FW20 ESSENTIAL] 캐시미어 Cashmere Single Coat Wood - brown",
                "9% 268,945won",
                R.drawable.ic_heart_red,
                79
            ),
            HomeWomanItemData(
                R.drawable.img_home_woman,
                "킨더살몬",
                "[FW20 ESSENTIAL] 캐시미어 Cashmere Single Coat Wood - brown",
                "9% 268,945won",
                R.drawable.ic_heart_red,
                79
            ),
            HomeWomanItemData(
                R.drawable.img_home_woman,
                "킨더살몬",
                "[FW20 ESSENTIAL] 캐시미어 Cashmere Single Coat Wood - brown",
                "9% 268,945won",
                R.drawable.ic_heart_red,
                79
            )
        )
    }

}