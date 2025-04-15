package com.example.actividad4_comunicacin

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ResumenActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resumen)

        val usuario = intent.getParcelableExtra<Usuario>("usuario")

        findViewById<TextView>(R.id.txtResumen).text = """
            Nombre: ${usuario?.nombre}
            Edad: ${usuario?.edad}
            Ciudad: ${usuario?.ciudad}
            Correo: ${usuario?.correo}
        """.trimIndent()

        findViewById<Button>(R.id.btnConfirmar).setOnClickListener {
            setResult(RESULT_OK)
            finish()
        }

        findViewById<Button>(R.id.btnEditar).setOnClickListener {
            setResult(RESULT_CANCELED)
            finish()
        }
    }
}
