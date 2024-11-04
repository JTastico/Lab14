package com.example.lab14.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.glance.text.Text
import androidx.navigation.NavHostController
import coil.compose.rememberImagePainter

@Composable
fun ListaRecetas(navController: NavHostController) {
    // Ejemplo de lista de recetas
    val recetas = listOf(
        Receta("1", "Spaghetti Carbonara", "https://example.com/spaghetti.jpg"),
        Receta("2", "Tacos", "https://example.com/tacos.jpg"),
        Receta("3", "Sushi", "https://example.com/sushi.jpg")
    )

    Column(modifier = Modifier.fillMaxSize()) {
        for (receta in recetas) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable { navController.navigate("detalle_receta/${receta.id}") }
                    .padding(8.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = rememberImagePainter(receta.imagenUrl),
                    contentDescription = receta.nombre,
                    modifier = Modifier.size(80.dp)
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(text = receta.nombre)
            }
        }
    }
}

data class Receta(val id: String, val nombre: String, val imagenUrl: String)
