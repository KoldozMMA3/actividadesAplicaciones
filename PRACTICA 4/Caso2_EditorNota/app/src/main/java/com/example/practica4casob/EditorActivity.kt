package com.example.practica4casob

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var etNota: EditText
    private var notaTexto = ""

    private val launcher = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
        if (result.resultCode == Activity.RESULT_OK) {
            val data = result.data
            notaTexto = data?.getStringExtra("nota") ?: ""
            etNota.setText(notaTexto)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etNota = findViewById(R.id.etNota)
        val btnCompartir = findViewById<Button>(R.id.btnCompartir)

        if (savedInstanceState != null) {
            notaTexto = savedInstanceState.getString("nota", "")
            etNota.setText(notaTexto)
        }

        btnCompartir.setOnClickListener {
            val texto = etNota.text.toString()
            val intent = Intent(this, OpcionesActivity::class.java)
            intent.putExtra("nota", texto)
            launcher.launch(intent)
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString("nota", etNota.text.toString())
    }
}
