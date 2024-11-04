package com.example.lab14.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.layout.*
import androidx.compose.material.*


@Composable
fun DetalleReceta(recetaId: String?) {
    // Datos simulados para la receta
    val receta = when (recetaId) {
        "1" -> RecetaDetalle("Spaghetti Carbonara", listOf("Spaghetti", "Eggs", "Pancetta", "Parmesan", "Pepper"), "Cocina la pasta, mezcla con los ingredientes.")
        "2" -> RecetaDetalle("Tacos", listOf("Tortillas", "Carne", "Cebolla", "Cilantro"), "Arma los tacos con los ingredientes.")
        "3" -> RecetaDetalle("Sushi", listOf("Arroz", "Pescado", "Alga Nori"), "Prepara el arroz y enrolla los ingredientes.")
        else -> null
    }

    receta?.let {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(text = it.nombre, fontSize = 24.sp) // Tamaño de fuente ajustado
            Text(text = "Ingredientes:", fontSize = 20.sp, modifier = Modifier.padding(top = 8.dp))
            for (ingrediente in it.ingredientes) {
                Text(text = "- $ingrediente", fontSize = 16.sp, modifier = Modifier.padding(start = 8.dp, top = 4.dp))
            }
            Text(text = "Preparación:", fontSize = 20.sp, modifier = Modifier.padding(top = 8.dp))
            Text(text = it.preparacion, fontSize = 16.sp, modifier = Modifier.padding(start = 8.dp, top = 4.dp))
        }
    } ?: run {
        Text(text = "Receta no encontrada", fontSize = 18.sp, modifier = Modifier.padding(16.dp))
    }
}

data class RecetaDetalle(val nombre: String, val ingredientes: List<String>, val preparacion: String)
