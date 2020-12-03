package com.example.org29cm_android.ui.binding

import android.util.Log
import android.widget.ImageButton
import android.widget.ImageView
import androidx.databinding.BindingAdapter

@BindingAdapter("isHeartChecked")
fun isHeartChecked(imageView: ImageButton, isChecked: Boolean){
    imageView.isSelected = isChecked
}

@BindingAdapter("setImageSource")
fun setImageSource(imageView: ImageView, resourceId: Int){
    imageView.setImageResource(resourceId)
}