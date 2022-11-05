package com.example.projetomobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Recuperar_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recuperar)
    }
    fun recuperada(view: View) {
        val intent = Intent(this, Recuperada_activity::class.java).apply {
        }
        startActivity(intent)
    }
}