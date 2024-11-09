package com.example.lab14

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

class ImagenVista : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ImagenVistaScreen()
        }
    }
}

@Composable
fun ImagenVistaScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF1E3A5F)), // Fondo azul frío
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Detalles de la Subasta",
            color = Color(0xFFA7C7E7), // Azul claro
            modifier = Modifier.padding(16.dp)
        )
        Text(
            text = "Producto: Reloj antiguo",
            color = Color(0xFFA7C7E7),
            modifier = Modifier.padding(8.dp)
        )
        Text(
            text = "Precio actual: $250",
            color = Color(0xFFA7C7E7),
            modifier = Modifier.padding(8.dp)
        )
        Button(
            onClick = { /* Acción para hacer una puja */ },
            modifier = Modifier
                .padding(16.dp)
                .background(Color(0xFF4A90E2))
        ) {
            Text("Realizar Pujas")
        }
    }
}
