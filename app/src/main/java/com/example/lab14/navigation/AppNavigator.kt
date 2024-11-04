package com.example.lab14.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.lab14.screens.DetalleReceta
import com.example.lab14.screens.ListaRecetas

@Composable
fun AppNavigator(navController: NavHostController) {
    NavHost(navController = navController, startDestination = "lista_recetas") {
        composable("lista_recetas") { ListaRecetas(navController) }
        composable("detalle_receta/{recetaId}") { backStackEntry ->
            DetalleReceta(recetaId = backStackEntry.arguments?.getString("recetaId"))
        }
    }
}
