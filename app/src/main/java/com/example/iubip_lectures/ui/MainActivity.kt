package com.example.iubip_lectures.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat
import androidx.navigation.ui.AppBarConfiguration
import com.example.iubip_lectures.data.domain.Choice
import com.example.iubip_lectures.data.domain.Status
import com.example.iubip_lectures.databinding.ActivityMainBinding
import com.example.iubip_lectures.useacases.Game

class MainActivity : AppCompatActivity() {

    private val game = Game()

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        WindowCompat.setDecorFitsSystemWindows(window, false)
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.kamen.setOnClickListener {
            playGame(Choice.ROCK)
        }
        binding.bumaga.setOnClickListener {
            playGame(Choice.PAPER)
        }
        binding.gg.setOnClickListener {
            playGame(Choice.SCISSORS)
        }
    }

    private fun playGame(playerChoice: Choice) {
        val status = game.game(playerChoice)

        if (status == Status.WIN) {
            startActivity(Intent(this, WinActivity::class.java))
        } else if (status == Status.LOSE) {
            startActivity(Intent(this, LoseActivity::class.java))
        } else {
            startActivity(Intent(this, DrawActivity::class.java))
        }
    }
}