package com.example.lab14.widget

import android.content.Context
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.glance.Button
import androidx.glance.GlanceId
import androidx.glance.GlanceModifier
import androidx.glance.GlanceTheme
import androidx.glance.Image
import androidx.glance.action.actionStartActivity
import androidx.glance.action.clickable
import androidx.glance.appwidget.GlanceAppWidget
import androidx.glance.appwidget.provideContent
import androidx.glance.background
import androidx.glance.layout.Alignment
import androidx.glance.layout.Column
import androidx.glance.layout.fillMaxSize
import androidx.glance.layout.padding
import androidx.glance.layout.size
import androidx.glance.text.Text
import androidx.glance.unit.ColorProvider
import com.example.lab14.ImagenVista
import com.example.lab14.R

class SimpleWidgetContent : GlanceAppWidget() {
    override suspend fun provideGlance(context: Context, id: GlanceId) {
        provideContent {
            GlanceTheme {
                SubastaDestacada()
            }
        }
    }
    @Preview
    @Composable
    private fun SubastaDestacada() {
        Column(
            modifier = GlanceModifier
                .fillMaxSize()
                .background(Color(0xFFA2BDF3)), // Fondo azul frío
            verticalAlignment = Alignment.CenterVertically,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // Título del widget
            Text(
                text = "Subasta Destacada del Día",
                modifier = GlanceModifier.padding(12.dp),
            )

            // Imagen de la subasta
            Image(
                provider = androidx.glance.ImageProvider(R.drawable.foto),
                contentDescription = "Imagen del producto destacado",
                modifier = GlanceModifier
                    .size(140.dp) // Tamaño de la imagen ajustado
                    .padding(8.dp)
                    .clickable(actionStartActivity<ImagenVista>()) // Al hacer clic, abre la vista de detalles
            )

            // Descripción y precio de la subasta
            Text(
                text = "Descripción: Pintura abstracta",
                modifier = GlanceModifier.padding(8.dp),
            )
            Text(
                text = "Precio: $250",
                modifier = GlanceModifier.padding(8.dp),
            )

            // Botón de puja rápida
            Button(
                text = "Pujar",
                onClick = actionStartActivity<ImagenVista>(), // Abre la vista de detalles
                modifier = GlanceModifier
                    .padding(10.dp)
                    .background(ColorProvider(Color(0xFF4A90E2))) // Color de fondo del botón
            )
        }
    }
}