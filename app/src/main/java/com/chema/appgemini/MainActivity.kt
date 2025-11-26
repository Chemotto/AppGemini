package com.chema.appgemini

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btnUno = findViewById<Button>(R.id.btnUno)
        btnUno.setOnClickListener {
            val intent = Intent(this, CatActivity::class.java)
            startActivity(intent)
        }

        val btnDos = findViewById<Button>(R.id.btnDos)
        btnDos.setOnClickListener {
            // Corregido: referenciar a la clase CitaActivity, no a activity_cita
            val intent = Intent(this, CitaActivity::class.java)
            startActivity(intent)
        }

        // Ejercicio Cuadrado
        val cuadrado = Cuadrado(5)
        cuadrado.imprimirArea()

        // Ejercicio Email
        try {
            val email = Email("test@example.com")
            println("Email válido: ${email.direccion}")
            // val emailInvalido = Email("testexample.com") // Esto lanzaría la excepción
        } catch (e: IllegalArgumentException) {
            e.printStackTrace()
        }

        // Ejercicio Libro
        val libro1 = Libro("El Quijote", "Cervantes")
        val libro2 = libro1.copy(autor = "Miguel de Cervantes")
        println("Libro 1: $libro1")
        println("Libro 2: $libro2")

        // Ejercicio AppConfig
        AppConfig.imprimirVersion()
    }
}
