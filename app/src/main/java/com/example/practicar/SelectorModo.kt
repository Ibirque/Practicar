package com.example.practicar

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class SelectorModo : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.selectormodo)

        val cardCompanion = findViewById<CardView>(R.id.cardCompanion)
        val cardHome = findViewById<CardView>(R.id.cardHome)

        cardCompanion.setOnClickListener {
            // Lanzar la actividad NuevoCompanyero
            val intent = Intent(this, NuevoCompanyero::class.java)
            startActivity(intent)
        }

        cardHome.setOnClickListener {
            // Lanzar la actividad NuevoHogar
            val intent = Intent(this, NuevoHogar::class.java)
            startActivity(intent)
        }
    }
}