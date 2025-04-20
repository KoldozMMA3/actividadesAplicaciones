package com.example.practica4casob

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class OpcionesActivity : AppCompatActivity() {

    private lateinit var nota: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_opciones)

        val tvNota = findViewById<TextView>(R.id.tvNota)
        val btnCorreo = findViewById<Button>(R.id.btnCorreo)
        val btnEditar = findViewById<Button>(R.id.btnEditar)

        nota = intent.getStringExtra("nota") ?: ""
        tvNota.text = nota

        btnCorreo.setOnClickListener {
            Toast.makeText(this, "Compartido por correo", Toast.LENGTH_SHORT).show()
        }

        btnEditar.setOnClickListener {
            val resultIntent = Intent()
            resultIntent.putExtra("nota", nota)
            setResult(RESULT_OK, resultIntent)
            finish()
        }
    }
}
