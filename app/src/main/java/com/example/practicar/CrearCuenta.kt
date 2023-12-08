package com.example.practicar

import android.os.Bundle
import android.view.LayoutInflater
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomsheet.BottomSheetDialog

class CrearCuenta : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.crearcuenta)

        // Configuración del dropdown para el año de nacimiento
        val spinnerBirthYear: Spinner = findViewById(R.id.spinnerBirthYear)
        val years = (1920..2023).toList().map { it.toString() }
        val birthYearAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, years)
        spinnerBirthYear.adapter = birthYearAdapter

        // Configuración del dropdown para el sexo
        val spinnerGender: Spinner = findViewById(R.id.spinnerGender)
        val genders = arrayOf("Masculino", "Femenino", "Otro")
        val genderAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, genders)
        spinnerGender.adapter = genderAdapter

        // Resto del código...
    }

    fun mostrarInicioSesion(view: android.view.View) {
        // Puedes abrir la página de inicio de sesión aquí
        mostrarMenuInicioSesion()
    }

    private fun mostrarMenuInicioSesion() {
        // Puedes reutilizar el código de la función mostrarMenuInicioSesion() que proporcionaste anteriormente
        // ...
    }
}
