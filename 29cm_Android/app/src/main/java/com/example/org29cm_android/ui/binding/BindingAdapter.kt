package com.example.org29cm_android.ui.binding

import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.BindingAdapter

@BindingAdapter("setTextWithUnit", "setUnit")
fun setTextWithUnit(textView: TextView, str: String, unit: String){
    textView.text = str + unit
}

@BindingAdapter("setTextWithUnit", "setUnit")
fun setTextWithUnit(textView: TextView, str: Float, unit: String){
    textView.text = str.toString() + unit
}

@BindingAdapter("isHeartChecked")
fun isHeartChecked(imageView: ImageView, isChecked: Boolean){
    imageView.isSelected = isChecked
}

@BindingAdapter("setImageSource")
fun setImageSource(imageView: ImageView, resourceId: Int){
    imageView.setImageResource(resourceId)
}