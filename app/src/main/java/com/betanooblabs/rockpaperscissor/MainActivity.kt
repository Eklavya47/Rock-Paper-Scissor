package com.betanooblabs.rockpaperscissor

import android.app.Dialog
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btnPlayWithOther: Button = findViewById(R.id.btnPlayWithOther)
        btnPlayWithOther.setOnClickListener {
            val intent = Intent(this, PlayWithOther::class.java)
            startActivity(intent)
        }

        val btnPlayWithComputer: Button = findViewById(R.id.btnPlayWithComputer)
        btnPlayWithComputer.setOnClickListener {
            val intent = Intent(this, PlayWithComputer::class.java)
            startActivity(intent)
        }

        val tvInstruction: TextView = findViewById(R.id.tvInstruction)
        tvInstruction.setOnClickListener {
            showInstructions()
        }
    }
    private fun showInstructions(){
        val instructionDialog = Dialog(this)
        instructionDialog.setContentView(R.layout.instructions_dialog)
        instructionDialog.findViewById<Button>(R.id.btnOk).setOnClickListener {
            instructionDialog.cancel()
        }
        instructionDialog.show()
    }
}