package com.example.actividad4_comunicacin

import android.os.Parcelable
import kotlinx.parcelize.Parcelize


@Parcelize
data class Usuario(
    val nombre: String,
    val edad: String,
    val ciudad: String,
    val correo: String
) : Parcelable
