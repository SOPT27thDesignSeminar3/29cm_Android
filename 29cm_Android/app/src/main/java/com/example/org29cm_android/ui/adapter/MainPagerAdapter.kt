package com.example.org29cm_android.ui.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.org29cm_android.ui.home.HomeFragment
import com.example.org29cm_android.ui.shop.ShopFragment

class MainPagerAdapter (fm: FragmentManager) :
    FragmentPagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {
    override fun getItem(position:Int) : Fragment {
        return when(position){
            0-> HomeFragment()
            else-> ShopFragment()
        }
    }
    override fun getCount() = 2
}