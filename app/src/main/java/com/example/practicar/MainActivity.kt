package com.example.practicar


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.ProgressBar
import android.content.Intent


class MainActivity : AppCompatActivity() {

    // Simula el tiempo de carga
    private val tiempoDeCarga = 3000L

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Muestra el ProgressBar
        val progressBar = findViewById<ProgressBar>(R.id.progressBar)
        progressBar.visibility = View.VISIBLE

        // Realiza tareas de carga (simuladas)
        Handler().postDelayed({
            // Oculta el ProgressBar después de que las tareas de carga hayan terminado
            progressBar.visibility = View.GONE

            // Inicia la actividad Pagina2
            val intent = Intent(this, Pagina2::class.java)
            startActivity(intent)

            // Finaliza la actividad actual (opcional, dependiendo de tu flujo de navegación)
            finish()
        }, tiempoDeCarga)
    }
}