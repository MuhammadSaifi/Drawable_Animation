package com.example.drawable_animation

import androidx.appcompat.app.AppCompatActivity

import android.graphics.drawable.AnimationDrawable
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_main.*
// It is our vecter drawable animation
// by using that code we can also walk any cartoon.
// check drawable for wifi and battery signal.
// it created by using our vector assets.
class MainActivity : AppCompatActivity() {

    lateinit var wifi: AnimationDrawable
    lateinit var batt: AnimationDrawable
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

           // for wifi animation
        image.setBackgroundResource(R.drawable.animation)
        wifi = image.background as AnimationDrawable
          // for battery animation
         image2.setBackgroundResource(R.drawable.anim)
        batt = image2.background as AnimationDrawable
    }
       //for start our animation we will used that function and start()
    override fun onWindowFocusChanged(hasFocus: Boolean) {
        super.onWindowFocusChanged(hasFocus)
        wifi.start()
        batt.start()
    }
}
