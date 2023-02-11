package com.example.button_ball_drop

//import androidx.appcompat.app.AppCompatActivity
//import android.os.Bundle
//
//class MainActivity : AppCompatActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//    }
//}


//SIMPLE BALL DROP ANIMATION
//import android.animation.ObjectAnimator
//import android.os.Bundle
//import android.view.View
//import android.widget.Button
//import android.widget.ImageView
//import androidx.appcompat.app.AppCompatActivity
//
//class MainActivity : AppCompatActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//
//        val ball = findViewById<ImageView>(R.id.ball)
//        val button = findViewById<Button>(R.id.button)
//
//        button.setOnClickListener {
//            val animation = ObjectAnimator.ofFloat(ball, View.TRANSLATION_Y, 0f, 1000f)
//            animation.duration = 1000
//            animation.start()
//        }
//    }
//}


import android.animation.ObjectAnimator
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ball = findViewById<ImageView>(R.id.ball)
//        val button = findViewById<Button>(R.id.button)
        val button = findViewById<ImageView>(R.id.imageView)

//        val button2 = findViewById<Button>(R.id.button2)

//        button2.setOnClickListener {
//            // Start the animation activity
//            val intent = Intent(this, animate::class.java)
//            startActivity(intent)
//        }

        // Hide the ball by default
        ball.visibility = View.INVISIBLE

        button.setOnClickListener {
            // Show the ball
            ball.visibility = View.VISIBLE

            // Animate the ball to drop from the top of the screen to the bottom
            val animation = ObjectAnimator.ofFloat(ball, View.TRANSLATION_Y, 0f, 2100f)
            animation.duration = 2000
            animation.start()
        }
    }
}
