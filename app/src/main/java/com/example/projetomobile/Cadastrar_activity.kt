package com.example.projetomobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Cadastrar_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastrar)
    }
    fun cadastrado(view: View) {
        val intent = Intent(this, Cadastrado_activity::class.java).apply {
        }
        startActivity(intent)
    }
}