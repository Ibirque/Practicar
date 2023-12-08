package com.example.practicar

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class PaginaLogin : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.paginalogin)

        val tvCreateAccountText = findViewById<TextView>(R.id.tvCreateAccountText)
        Log.d("Log previo crearcuenta", "CrearCuenta() llamamos")
        // Agrega un clic listener al texto para abrir la página CrearCuenta
        tvCreateAccountText.setOnClickListener {
            val intent = Intent(this, CrearCuenta::class.java)
            Log.d("Log de llamada", "CrearCuenta() llamada")
            startActivity(intent)
        }

        // Otro código de inicialización si es necesario
    }
}