package com.example.iubip_lectures.ui

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat
import com.example.iubip_lectures.databinding.ActivityLoseBinding

class LoseActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoseBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        WindowCompat.setDecorFitsSystemWindows(window, false)
        super.onCreate(savedInstanceState)

        binding = ActivityLoseBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Toast.makeText(applicationContext, "Lose", Toast.LENGTH_SHORT).show()
    }
}