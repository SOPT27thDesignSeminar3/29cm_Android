package com.example.org29cm_android.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.org29cm_android.R
import com.example.org29cm_android.databinding.FragmentHomeBinding
import com.example.org29cm_android.ui.adapter.HomeViewPagerAdapter

/**
 * Created by SSong-develop on 2020-11-30
 */
class HomeFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding : FragmentHomeBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_home,container,false)
        val homeViewPagerAdapter = HomeViewPagerAdapter(parentFragmentManager)

        setAdapter(binding,homeViewPagerAdapter)
        return binding.root
    }

    private fun setAdapter(binding: FragmentHomeBinding, homeViewPagerAdapter: HomeViewPagerAdapter) {
        binding.viewpagerHome.apply {
            adapter = homeViewPagerAdapter
        }
        binding.tabHome.apply {
            setupWithViewPager(binding.viewpagerHome)
            getTabAt(0)?.text = "전체"
            getTabAt(1)?.text = "우먼"
            getTabAt(2)?.text = "맨"
            getTabAt(3)?.text = "라이프"
            getTabAt(4)?.text = "POP UP"
        }
    }
}