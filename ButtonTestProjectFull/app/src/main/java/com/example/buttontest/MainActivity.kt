
package com.example.buttontest

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.textViewMessage)
        val btnSaudacao = findViewById<Button>(R.id.buttonSaudacao)
        val btnLimpar = findViewById<Button>(R.id.buttonLimpar)

        btnSaudacao.setOnClickListener {
            textView.text = "Olá, seja bem-vindo!"
        }

        btnLimpar.setOnClickListener {
            textView.text = ""
        }
    }
}
