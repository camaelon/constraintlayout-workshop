package com.example.motionshoes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import androidx.constraintlayout.motion.widget.MotionLayout

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun verifyUser(view: View) {
        var layout = findViewById<MotionLayout>(R.id.base)
        var email = findViewById<EditText>(R.id.email_text)
        if (email.text.toString().equals("john")) { // todo real verification
            layout.transitionToState(R.id.end);
        } else {
            layout.transitionToState(R.id.disconnected)
        }
    }
}
