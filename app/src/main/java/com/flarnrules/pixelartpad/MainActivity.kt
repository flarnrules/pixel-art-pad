package com.flarnrules.pixelartpad

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        // Initialize your CanvasView here
        val canvasView = CanvasView(this)
        
        // Set the CanvasView as the content view
        setContentView(canvasView)
    }
}
