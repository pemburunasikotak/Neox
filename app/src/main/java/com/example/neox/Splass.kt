package com.example.neox

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.os.Handler

class Splass : Activity() {
    lateinit var handler: Handler
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splas)

        handler = Handler()
        handler.postDelayed({
            val intent = Intent(this@Splass, MainActivity::class.java)
            startActivity(intent)
            finish()
        }, 5000)
    }
}