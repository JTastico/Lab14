package com.example.lab14
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import androidx.navigation.compose.rememberNavController
import com.example.lab14.navigation.AppNavigator

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                val navController = rememberNavController()
                AppNavigator(navController = navController)

                // Verifica si el intent contiene la redirección
                val destino = intent.getStringExtra("destino")
                if (destino == "lista_recetas") {
                    navController.navigate("lista_recetas")
                }
            }
        }
    }
}
