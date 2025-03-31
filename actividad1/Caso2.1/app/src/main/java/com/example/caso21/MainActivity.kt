package com.example.caso21

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.media.MediaPlayer

class MainActivity : AppCompatActivity() {

    private var musica: MediaPlayer? = null
    private var canciones = arrayOf(R.raw.a, R.raw.b, R.raw.c) // Lista de canciones
    private var indiceCancion = 0 // Índice de la canción actual

    fun play(view: View) {
        if (musica == null) {
            musica = MediaPlayer.create(this, canciones[indiceCancion])
            musica?.start()
            Toast.makeText(this, "Reproduciendo canción", Toast.LENGTH_SHORT).show()
        } else if (!musica!!.isPlaying) {
            musica?.start()
            Toast.makeText(this, "Reanudando canción", Toast.LENGTH_SHORT).show()
        }
    }

    fun stop(view: View) {
        if (musica != null) {
            musica?.stop()
            musica?.release()
            musica = null
            Toast.makeText(this, "Canción detenida", Toast.LENGTH_SHORT).show()
        }
    }

    fun anterior(view: View) {
        if (indiceCancion > 0) {
            indiceCancion--
        } else {
            indiceCancion = canciones.size - 1 // Ir a la última canción si está en la primera
        }
        cambiarCancion()
    }

    fun siguiente(view: View) {
        if (indiceCancion < canciones.size - 1) {
            indiceCancion++
        } else {
            indiceCancion = 0 // Volver a la primera canción
        }
        cambiarCancion()
    }

    private fun cambiarCancion() {
        if (musica != null) {
            musica?.stop()
            musica?.release()
        }
        musica = MediaPlayer.create(this, canciones[indiceCancion])
        musica?.start()
        Toast.makeText(this, "Reproduciendo nueva canción", Toast.LENGTH_SHORT).show()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
