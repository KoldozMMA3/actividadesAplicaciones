package com.example.navegacion

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController


class SeleccionExtrasFragment : Fragment(R.layout.fragment_seleccion_extras) {

    private var tipoComida: String? = null
    private var extrasSeleccionados: String = ""

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Recibe los datos del Bundle
        tipoComida = arguments?.getString("tipo_comida")

        // Verifica que el tipo de comida esté siendo recibido correctamente
        Log.d("SeleccionExtrasFragment", "Tipo de comida seleccionado: $tipoComida")

        // Configura los botones y su funcionalidad (como lo tienes en el código actual)
        // Por ejemplo:

        val btnBebida: Button = view.findViewById(R.id.btnBebida)
        btnBebida.setOnClickListener {
            extrasSeleccionados += "Bebida, "
        }
        val btnPapas: Button = view.findViewById(R.id.btnPapas)
        btnPapas.setOnClickListener {
            extrasSeleccionados += "Papas, "
        }
        val btnPostre: Button = view.findViewById(R.id.btnPostre)
        btnPostre.setOnClickListener {
            extrasSeleccionados += "Postre, "
        }



        // Configura el botón "Siguiente"
        val btnSiguiente: Button = view.findViewById(R.id.btnSiguiente)
        btnSiguiente.setOnClickListener {
            val bundle = Bundle().apply {
                putString("tipo_comida", tipoComida)  // Pasa la comida seleccionada
                putString("extras_comida", extrasSeleccionados)  // Pasa los extras seleccionados
            }
            findNavController().navigate(R.id.action_seleccionExtrasFragment_to_resumenPedidoFragment, bundle)
        }
    }
}
