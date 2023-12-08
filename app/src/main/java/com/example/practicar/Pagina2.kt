package com.example.practicar

import android.animation.ObjectAnimator
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomsheet.BottomSheetDialog


class Pagina2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pagina2)

        val imageViewCat = findViewById<ImageView>(R.id.imageView)


        // Añade un listener de clic al ImageView
        imageViewCat.setOnClickListener {
            mostrarMenuInicioSesion()
            //mostrarCrearCuenta()
        }

        // Llama al método para mostrar el menú de inicio de sesión con retraso
        Handler().postDelayed({
            mostrarMenuInicioSesion()
           //mostrarCrearCuenta()
        }, 500) // Retraso de 500 milisegundos (ajusta según sea necesario)


    }

    fun mostrarMenuInicioSesion() {
        // Infla el diseño del menú de inicio de sesión
        val view = LayoutInflater.from(this).inflate(R.layout.paginalogin, null)

        // Crea un BottomSheetDialog
        val bottomSheetDialog = BottomSheetDialog(this)
        bottomSheetDialog.setContentView(view)

        // Realiza una animación de entrada (slide in) en la vista
        val slideIn = ObjectAnimator.ofFloat(view, "translationY", 300f, 0f)
        slideIn.duration = 500 // Duración de la animación en milisegundos
        slideIn.start()

        // Configura el botón de inicio de sesión
        val btnLogin = view.findViewById<Button>(R.id.btnLogin)
        btnLogin.setOnClickListener {
            // Agrega la lógica para manejar el inicio de sesión aquí
            // ...

            // Cierra el BottomSheetDialog
            bottomSheetDialog.dismiss()

            // Inicia la actividad SelectorModo
            iniciarSesion()
        }

        val tvCreateAccountText = view.findViewById<TextView>(R.id.tvCreateAccountText)
        tvCreateAccountText.setOnClickListener {
            // Agrega la lógica para manejar el clic en "¿Aun no tienes cuenta?"
            // ...

            // Cierra el BottomSheetDialog
            bottomSheetDialog.dismiss()

            // Inicia la actividad CrearCuenta
            iniciarCrearCuenta()
        }

        // Muestra el BottomSheetDialog
        bottomSheetDialog.show()
    }


    fun iniciarCrearCuenta() {
        val intent = Intent(this, CrearCuenta::class.java)
        startActivity(intent)
    }

    // Método para iniciar la actividad SelectorModo
    fun iniciarSesion() {
        val intent = Intent(this, SelectorModo::class.java)
        startActivity(intent)
    }


    private fun handleGoogleLogin(view: View) {
        // Lógica para manejar el clic del botón Google Login
        // ...
    }
}