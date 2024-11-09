package com.example.lab14

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

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
    Surface(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF1E3A5F)), // Fondo azul frío
        color = MaterialTheme.colorScheme.background
    ) {
        Column(
            modifier = Modifier.fillMaxSize().padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            // Imagen
            Image(
                painter = painterResource(id = R.drawable.foto), // Cambia "foto" por el nombre de tu recurso de imagen
                contentDescription = "Imagen del objeto",
                modifier = Modifier.size(200.dp).padding(bottom = 16.dp)
            )

            // Descripción
            Text(
                text = "Descripción: Algo del objeto",
                color = Color(0xFFA7C7E7), // Color de texto azul claro
                fontSize = 18.sp,
                modifier = Modifier.padding(bottom = 8.dp)
            )

            // Precio
            Text(
                text = "Precio: $50",
                color = Color(0xFFA7C7E7),
                fontSize = 18.sp
            )
        }
    }
}
