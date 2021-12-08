package com.example.androidclasses

import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Animation : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animation)

        val fade_in: Button = findViewById(R.id.fade_in)
        val fade_out: Button = findViewById(R.id.fade_out)
        val zoom_in: Button = findViewById(R.id.zoom_in)
        val zoom_out: Button = findViewById(R.id.zoom_out)
        val slide_up: Button = findViewById(R.id.slide_up)
        val slide_down: Button = findViewById(R.id.slide_down)
        val rotate: Button = findViewById(R.id.rotate)
        val bounce: Button = findViewById(R.id.bounce)

        val textView: TextView = findViewById(R.id.textView)





        fade_in.setOnClickListener {
            val animationFadeIn = AnimationUtils.loadAnimation(this, R.anim.fade_in)
            textView.startAnimation(animationFadeIn)
        }

        fade_out.setOnClickListener {
            val animationFadeOut = AnimationUtils.loadAnimation(this, R.anim.fade_out)
            textView.startAnimation(animationFadeOut)
        }

        zoom_out.setOnClickListener {
            val animationZoomOut = AnimationUtils.loadAnimation(this, R.anim.zoom_out)
            textView.startAnimation(animationZoomOut)
        }
        zoom_in.setOnClickListener {
            val animationZoomIn = AnimationUtils.loadAnimation(this, R.anim.zoom_in)
            textView.startAnimation(animationZoomIn)
        }
        slide_up.setOnClickListener {
            val animationSlideUp = AnimationUtils.loadAnimation(this, R.anim.slide_out)
            textView.startAnimation(animationSlideUp)
        }
        slide_down.setOnClickListener {
            val animationSlideDown = AnimationUtils.loadAnimation(this, R.anim.slide_in)
            textView.startAnimation(animationSlideDown)
        }
        rotate.setOnClickListener {
            val animationRotate = AnimationUtils.loadAnimation(this, R.anim.rotate)
            textView.startAnimation(animationRotate)
        }
        bounce.setOnClickListener {
            val animationBounce = AnimationUtils.loadAnimation(this, R.anim.bounce)
            textView.startAnimation(animationBounce)
        }
    }
}