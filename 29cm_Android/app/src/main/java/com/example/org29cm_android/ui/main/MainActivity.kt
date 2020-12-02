package com.example.org29cm_android.ui.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.org29cm_android.R
import com.example.org29cm_android.ui.adapter.MainPagerAdapter
import com.example.org29cm_android.util.addViewPagerListener
import com.example.org29cm_android.util.setBottomNavigationListener
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottom_navi.itemIconTintList=null
        vp_main.adapter = MainPagerAdapter(supportFragmentManager)
        vp_main.addViewPagerListener(bottom_navi)
        bottom_navi.setBottomNavigationListener(vp_main)
    }
}