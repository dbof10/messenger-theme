package com.ctech.messenger.widget

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.ImageView

class KeyboardAwareImageView : ImageView {

    private var listener: OnKeyboardShowHideListener? = null

    constructor(context: Context) : super(context)

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs)

    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int) : super(context, attrs, defStyleAttr)

    fun setKeyboardListener(listener: OnKeyboardShowHideListener) {
        this.listener = listener
    }

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        val proposedHeight = View.MeasureSpec.getSize(heightMeasureSpec)
        val actualHeight = height
        if (actualHeight != proposedHeight && listener != null) {
            if (actualHeight > proposedHeight) {
                listener?.onToggle(true, proposedHeight)
            } else {
                listener?.onToggle(false, proposedHeight)
            }
        }
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)
    }

    interface OnKeyboardShowHideListener {

        fun onToggle(visible: Boolean, height: Int)
    }
}