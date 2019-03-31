package com.ctech.messenger.utils

import android.view.MotionEvent
import android.view.View

typealias OnItemClickListener = (view: View, pos: Int) -> Unit
typealias OnItemHoverListener = (view: View, position: Int, event: MotionEvent) -> Unit