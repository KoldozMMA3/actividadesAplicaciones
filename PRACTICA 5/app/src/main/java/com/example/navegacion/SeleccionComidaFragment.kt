package com.example.navegacion

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.setFragmentResultListener
import androidx.navigation.fragment.findNavController


class SeleccionComidaFragment : Fragment(R.layout.fragment_seleccion_comida) {

    private var tipoComidaSeleccionada: String? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Aquí agregarías botones para las opciones de comida, por ejemplo:
        val btnPizza: Button = view.findViewById(R.id.btnPizza)
        btnPizza.setOnClickListener {
            tipoComidaSeleccionada = "Pizza"
        }

        val btnHamburguesa: Button = view.findViewById(R.id.btnHamburguesa)
        btnHamburguesa.setOnClickListener {
            tipoComidaSeleccionada = "Hamburguesa"
        }

        val btnEnsalada: Button = view.findViewById(R.id.btnEnsalada)
        btnEnsalada.setOnClickListener {
            tipoComidaSeleccionada = "Ensalada"
        }

        val btnSiguiente: Button = view.findViewById(R.id.btnSiguiente)
        btnSiguiente.setOnClickListener {
            val bundle = Bundle().apply {
                putString("tipo_comida", tipoComidaSeleccionada)
            }
            findNavController().navigate(R.id.action_seleccionComidaFragment_to_seleccionExtrasFragment, bundle)

        }
    }
}



