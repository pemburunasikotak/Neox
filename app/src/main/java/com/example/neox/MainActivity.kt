package com.example.neox

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_trivia.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_trivia)

        img_gunung.setOnClickListener{
            val intent:Intent = Intent(applicationContext, Trivia::class.java)
            startActivity(intent)
        }
        
    }
}
