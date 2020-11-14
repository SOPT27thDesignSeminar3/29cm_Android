package com.example.org29cm_android.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.org29cm_android.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottom_navi.itemIconTintList=null
    }
}