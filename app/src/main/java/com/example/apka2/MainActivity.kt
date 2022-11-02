package com.example.apka2

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.kolejny).setOnClickListener {
            findViewById<ImageView>(R.id.obrazekjeden).setImageResource(R.drawable.obrazekdwa)
        }
        findViewById<Button>(R.id.przywroc).setOnClickListener {
            findViewById<ImageView>(R.id.obrazekjeden).setImageResource(R.drawable.obrazekjeden)
        }
    }
}