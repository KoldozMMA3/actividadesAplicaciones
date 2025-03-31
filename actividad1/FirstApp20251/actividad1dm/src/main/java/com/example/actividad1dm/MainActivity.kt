package com.example.actividad1dm

import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {  // Agregar override
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        // Referencia a la imagen
        val miImagen = findViewById<ImageView>(R.id.imageView)

        // Evento de clic para mostrar un Toast
        miImagen.setOnClickListener {
            Toast.makeText(this, "¡Me diste Me gusta!", Toast.LENGTH_SHORT).show()
        }
    }
}