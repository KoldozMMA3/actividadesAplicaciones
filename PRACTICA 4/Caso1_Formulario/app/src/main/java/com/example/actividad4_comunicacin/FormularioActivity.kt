package com.example.actividad4_comunicacin

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity


class FormularioActivity : AppCompatActivity() {private lateinit var nombreEdit: EditText
    private lateinit var edadEdit: EditText
    private lateinit var ciudadEdit: EditText
    private lateinit var correoEdit: EditText

    private val resumenLauncher = registerForActivityResult(
        ActivityResultContracts.StartActivityForResult()
    ) { result ->
        if (result.resultCode == RESULT_OK) {
            Toast.makeText(this, "Perfil guardado correctamente", Toast.LENGTH_SHORT).show()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nombreEdit = findViewById(R.id.nombreEdit)
        edadEdit = findViewById(R.id.edadEdit)
        ciudadEdit = findViewById(R.id.ciudadEdit)
        correoEdit = findViewById(R.id.correoEdit)

        findViewById<Button>(R.id.btnContinuar).setOnClickListener {
            val usuario = Usuario(
                nombreEdit.text.toString(),
                edadEdit.text.toString(),
                ciudadEdit.text.toString(),
                correoEdit.text.toString()
            )

            val intent = Intent(this, ResumenActivity::class.java)
            intent.putExtra("usuario", usuario)
            resumenLauncher.launch(intent)
        }
    }
}