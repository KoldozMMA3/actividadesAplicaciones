package com.example.navegacion

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.setFragmentResult
import androidx.navigation.fragment.findNavController


class ResumenPedidoFragment : Fragment(R.layout.fragment_resumen_pedido) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val tipoComida = arguments?.getString("tipo_comida")
        val extras = arguments?.getString("extras_comida")


        val btnConfirmar: Button = view.findViewById(R.id.btnConfirmar)
        btnConfirmar.setOnClickListener {
            Toast.makeText(requireContext(), "Pedido confirmado: $tipoComida con $extras", Toast.LENGTH_SHORT).show()
            findNavController().navigate(R.id.action_resumenPedidoFragment_to_inicioFragment)
        }

        val btnEditar: Button = view.findViewById(R.id.btnEditar)
        btnEditar.setOnClickListener {
            val result = Bundle().apply {
                putString("tipo_comida", tipoComida)
                putString("extras", extras)
            }
            setFragmentResult("requestKey", result)
            findNavController().popBackStack()
        }
    }
}
