package com.chema.appgemini

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class CitaActivity : AppCompatActivity() {

    private val listaCitas = listOf(
        Cita("La vida es lo que pasa mientras estás ocupado haciendo otros planes.", "John Lennon"),
        Cita("El único modo de hacer un gran trabajo es amar lo que haces.", "Steve Jobs"),
        Cita("No cuentes los días, haz que los días cuenten.", "Muhammad Ali")
    )

    private lateinit var tvCita: TextView
    private lateinit var tvAutor: TextView
    private lateinit var btnNuevaCita: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_cita)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Inicializar las vistas
        tvCita = findViewById(R.id.tv_cita)
        tvAutor = findViewById(R.id.tv_autor)
        btnNuevaCita = findViewById(R.id.btn_nueva_cita)

        // Mostrar la primera cita al cargar la actividad
        mostrarNuevaCita()

        // Configurar el listener del botón para cambiar la cita
        btnNuevaCita.setOnClickListener {
            mostrarNuevaCita()
        }
    }

    private fun mostrarNuevaCita() {
        val cita = listaCitas.random()
        tvCita.text = cita.texto
        tvAutor.text = cita.autor
    }
}
