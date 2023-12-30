package com.flarnrules.pixelartpad

import android.content.Context
import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.Color
import android.view.MotionEvent
import android.view.View

class CanvasView(context: Context) : View(context) {
    private val paint = Paint()
    private var bitmap: Bitmap = Bitmap.createBitmap(16, 16, Bitmap.Config.ARGB_8888)
    private var canvas = Canvas(bitmap)
    private val blockSize = 40f // Size of each block in the grid

    init {
        paint.style = Paint.Style.FILL
        bitmap.eraseColor(Color.WHITE) // Set default color
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        // Draw the 16x16 grid
        for (i in 0 until 16) {
            for (j in 0 until 16) {
                paint.color = bitmap.getPixel(i, j)
                canvas.drawRect(
                    i * blockSize,
                    j * blockSize,
                    (i + 1) * blockSize,
                    (j + 1) * blockSize,
                    paint
                )
            }
        }
    }

    override fun onTouchEvent(event: MotionEvent): Boolean {
        val x = (event.x / blockSize).toInt()
        val y = (event.y / blockSize).toInt()
        
        if (event.action == MotionEvent.ACTION_DOWN || event.action == MotionEvent.ACTION_MOVE) {
            if (x < 16 && y < 16) {
                // Set the pixel to a fixed color for now, e.g., black
                bitmap.setPixel(x, y, Color.BLACK)
                invalidate()
            }
        }
        return true
    }
}
