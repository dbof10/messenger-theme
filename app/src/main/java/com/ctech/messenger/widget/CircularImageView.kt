package com.ctech.messenger.widget;

import android.content.Context
import android.graphics.Outline
import android.util.AttributeSet
import android.view.View
import android.view.ViewOutlineProvider
import androidx.appcompat.widget.AppCompatImageView

class CircularImageView(context: Context, attrs: AttributeSet) : AppCompatImageView(context, attrs) {

    companion object {
        val CIRCULAR_OUTLINE: ViewOutlineProvider = object : ViewOutlineProvider() {
            override fun getOutline(view: View, outline: Outline) {
                outline.setOval(view.paddingLeft,
                        view.paddingTop,
                        view.width - view.paddingRight,
                        view.height - view.paddingBottom)
            }
        }
    }

    init {
        outlineProvider = CIRCULAR_OUTLINE
        clipToOutline = true
    }
}