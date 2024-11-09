package com.example.lab14.widget

import android.content.Context
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
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
import androidx.glance.layout.Row
import androidx.glance.layout.Spacer
import androidx.glance.layout.fillMaxSize
import androidx.glance.layout.fillMaxWidth
import androidx.glance.layout.height
import androidx.glance.layout.padding
import androidx.glance.layout.width
import androidx.glance.text.Text
import androidx.glance.unit.ColorProvider
import com.example.lab14.MainActivity
import com.example.lab14.R
import com.example.lab14.SecondActivity
import com.example.lab14.ImagenVista // Importa la clase ImagenVista

class SimpleWidgetContent : GlanceAppWidget() {
    override suspend fun provideGlance(context: Context, id: GlanceId) {
        provideContent {
            GlanceTheme {
                MyContent()
            }
        }
    }

    @Composable
    private fun MyContent() {
        Column(
            modifier = GlanceModifier
                .fillMaxSize()
                .background(Color(0xFF1E3A5F)), // Fondo azul frío
            verticalAlignment = Alignment.CenterVertically,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "¿A dónde quieres dirigirte?",
                modifier = GlanceModifier.padding(12.dp)
            )

            // Imagen en el centro con acción para abrir ImagenVista
            Image(
                provider = androidx.glance.ImageProvider(R.drawable.foto),
                contentDescription = "Imagen en el centro",
                modifier = GlanceModifier
                    .width(140.dp) // Ajuste del ancho de la imagen
                    .height(100.dp) // Ajuste de la altura de la imagen
                    .padding(8.dp)
                    .clickable(onClick = actionStartActivity<ImagenVista>()) // Acción para abrir ImagenVista
            )

            Spacer(modifier = GlanceModifier.height(16.dp).fillMaxWidth())

            // Botones en la parte inferior
            Row(
                modifier = GlanceModifier
                    .fillMaxWidth()
                    .padding(bottom = 19.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Button(
                    text = "Página Principal",
                    onClick = actionStartActivity<MainActivity>(),
                    modifier = GlanceModifier
                        .padding(10.dp)
                        .background(ColorProvider(Color(0xFF4A90E2))) // Color de fondo del botón
                )
                Button(
                    text = "Segunda Actividad",
                    onClick = actionStartActivity<SecondActivity>(),
                    modifier = GlanceModifier
                        .padding(10.dp)
                        .background(ColorProvider(Color(0xFF4A90E2))) // Color de fondo del botón
                )
            }
        }
    }
}
