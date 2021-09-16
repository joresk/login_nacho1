package com.example.login_nacho

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_welcome.*

class welcome : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)
        btnBack.setOnClickListener { onBackPressed() }
        showUser()
    }
    fun showUser(){
        val recepcion = intent.extras
        val nombre = recepcion?.get("ACCION_NACHO")
        txtWelcome.text = "Usuario: $nombre"
    }
}