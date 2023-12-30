package com.flarnrules.pixelartpad

import android.content.Context
import android.graphics.Canvas
import android.view.View

class CanvasView(context: Context) : View(context) {
    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        // Drawing logic goes here
    }
    // Handle touch events to draw pixels
}
