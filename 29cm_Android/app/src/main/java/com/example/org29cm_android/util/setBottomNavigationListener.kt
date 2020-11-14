package com.example.org29cm_android.util

import androidx.viewpager.widget.ViewPager
import com.example.org29cm_android.R
import com.google.android.material.bottomnavigation.BottomNavigationView

fun BottomNavigationView.setBottomNavigationListener(viewPager : ViewPager) {
    this.setOnNavigationItemSelectedListener {
        when (it.itemId) {
            R.id.nv_home -> viewPager.currentItem = 0
            R.id.nv_shop -> viewPager.currentItem = 1
        }
        true
    }
}