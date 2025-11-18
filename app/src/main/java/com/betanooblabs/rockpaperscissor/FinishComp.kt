package com.betanooblabs.rockpaperscissor

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import pl.droidsonroids.gif.GifImageView

class FinishComp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_finish_comp)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.finishComp)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val winner = intent.getStringExtra("winner")
        val btnHome: Button = findViewById(R.id.btnHome)
        setView(winner.toString())
        btnHome.setOnClickListener {
            finish()
        }
    }
    private fun setView(winner: String){
        val imageView: GifImageView = findViewById(R.id.statusDisplay)
        val tvStatus: TextView = findViewById(R.id.tv_Status)
        if (winner == "comp"){
            imageView.setImageResource(R.drawable.lose_gif)
            tvStatus.text = "Better Luck Next Time\nYou Lose!"
        }
        else{
            imageView.setImageResource(R.drawable.win_gif)
            tvStatus.text = "Congratulations\nYou Won!"
        }
    }
}