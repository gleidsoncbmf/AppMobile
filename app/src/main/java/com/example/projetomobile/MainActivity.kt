package com.example.projetomobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun login(view: View) {
        val intent = Intent(this, Login_activity::class.java).apply {
        }
        startActivity(intent)
    }
    fun cadastrar(view: View) {
        val intent = Intent(this, Cadastrar_activity::class.java).apply {
        }
        startActivity(intent)
    }
    fun recuperar(view: View) {
        val intent = Intent(this, Recuperar_activity::class.java).apply {
        }
        startActivity(intent)
    }
}