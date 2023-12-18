package com.example.ejemplonavegacioncompose.ui.nav

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.ejemplonavegacioncompose.ui.PantallaSaludo
import com.example.ejemplonavegacioncompose.ui.home.PantallaHome
import com.example.ejemplonavegacioncompose.ui.rutas.Rutas


@Composable
fun GrafoNavegacion(){
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Rutas.PantallaUno.ruta) {

        // "URL" -> Composable
        composable(Rutas.PantallaUno.ruta){
            PantallaHome(navController = navController)
        }

        composable(Rutas.PantallaDos.ruta + "/{cosa}"){
            var nombreRecibido = it.arguments?.getString("cosa")
            if (nombreRecibido != null) {
                PantallaSaludo(nombreRecibido)
            }
        }
    }
}


