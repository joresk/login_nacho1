package com.example.login_nacho

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnLogin.setOnClickListener { checkLogin() }
    }
    fun checkLogin(){
        if (edtUser.text.isNotEmpty() && edtPassword.text.isNotEmpty()){
            //pasamos a la siguiente pantalla
            val accion = Intent(this, welcome::class.java)
            accion.putExtra("ACCION_NACHO", edtUser.text)
            startActivity(accion)
        }else{
            //sino
            Toast.makeText(this, "Revise los campos...", Toast.LENGTH_SHORT).show()
        }
    }
}