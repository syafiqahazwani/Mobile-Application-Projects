package com.example.anime_quiz.Activity

import android.content.Intent
import android.os.Bundle
import android.view.Window
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.example.anime_quiz.R
import com.example.anime_quiz.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val window: Window = this@MainActivity.window
        window.statusBarColor = ContextCompat.getColor(this@MainActivity, R.color.grey)

        binding.apply {

            startBtn.setOnClickListener {
                val intent = Intent(this@MainActivity, AnimeActivity::class.java)
                startActivity(intent)
            }

            leaderBtn.setOnClickListener {
                val intent = Intent(this@MainActivity, LeaderActivity::class.java)
                startActivity(intent)
            }
        }
    }
}