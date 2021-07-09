package com.example.myapplication.view.customview

import android.content.Context
import android.text.SpannableString
import android.text.Spanned
import android.text.style.StrikethroughSpan
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatTextView
import java.util.jar.Attributes

class CustomTextView(context: Context , attributes: AttributeSet) : AppCompatTextView(context,attributes) {

    init {
        drawline()
        textSize = 12f
    }

    fun setCustomText(value:String){
        text = value
        drawline()
    }

  private  fun drawline(){
        val span = SpannableString(text)
        span.setSpan(StrikethroughSpan(),0,text.length,Spanned.SPAN_MARK_MARK)
        text = span
    }
}