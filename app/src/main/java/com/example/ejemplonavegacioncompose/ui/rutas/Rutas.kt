package com.example.ejemplonavegacioncompose.ui.rutas

sealed class Rutas(val ruta: String) {
    /* TODO
        Crear e identificar las rutas (diferentes pantallas) de nuestra app
     */
    object PantallaUno: Rutas("pantallauno")
    object PantallaDos: Rutas("pantallados")
}
