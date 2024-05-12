package com.ssajudn.portalunpab.navigation

sealed class Screen(val route: String){
    data object HomeScreen : Screen("home")
    data object LoginScreen : Screen("login")
}