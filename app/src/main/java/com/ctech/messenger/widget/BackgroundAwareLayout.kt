package com.ctech.messenger.widget

import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.PorterDuff.Mode
import android.graphics.PorterDuffXfermode
import android.util.AttributeSet
import android.view.View
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat
import com.ctech.messenger.R

class BackgroundAwareLayout(context: Context?, attrs: AttributeSet) : ConstraintLayout(context, attrs) {
    private var childId: Int = 0
    private lateinit var childView: View
    private lateinit var eraser: Paint
    private var radius: Float = 0F

    init {
        setup(attrs)
    }

    private fun setup(attrs: AttributeSet) {
        val ta = context.obtainStyledAttributes(attrs, R.styleable.BackgroundAwareLayout)
        this.childId = ta.getResourceId(0, 0)
        this.radius = resources.getDimensionPixelSize(R.dimen.onboarding_bubble_radius).toFloat()
        if (this.childId != 0) {
            ta.recycle()
            setupEraser()
            return
        }
        throw IllegalArgumentException("unable to find childId to create a hole")
    }

    override fun onViewAdded(view: View) {
        super.onViewAdded(view)
        if (view.id == this.childId) {
            this.childView = view
        }
    }

    private fun setupEraser() {
        this.eraser = Paint()
        eraser.color = ContextCompat.getColor(context, android.R.color.transparent)
        eraser.xfermode = PorterDuffXfermode(Mode.CLEAR)
        eraser.isAntiAlias = true
         setLayerType(LAYER_TYPE_SOFTWARE, null)
    }

    override fun dispatchDraw(canvas: Canvas) {

        canvas.drawRoundRect(childView.left.toFloat(), childView.top.toFloat(),
                childView.right.toFloat(), childView.bottom.toFloat(), radius, radius, eraser)
        super.dispatchDraw(canvas)
    }
}
