package com.example.org29cm_android.ui.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.example.org29cm_android.ui.home.fragment.*

/**
 * Created by SSong-develop on 2020-11-30
 */

class HomeViewPagerAdapter(fm: FragmentManager) : FragmentStatePagerAdapter(
    fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT
) {
    override fun getCount(): Int = 5

    override fun getItem(position: Int): Fragment {
        return when(position){
            0 -> HomeAllFragment()
            1 -> HomeWomanFragment()
            2 -> HomeManFragment()
            3 -> HomeLifeFragment()
            else -> HomePopupFragment()
        }
    }
}