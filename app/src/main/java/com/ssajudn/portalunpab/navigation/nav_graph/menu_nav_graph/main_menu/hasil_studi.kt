package com.ssajudn.portalunpab.navigation.nav_graph.menu_nav_graph.main_menu

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.ssajudn.portalunpab.navigation.Screen
import com.ssajudn.portalunpab.presentation.menu_screen.main_menu.HasilStudi
import com.ssajudn.portalunpab.presentation.menu_screen.main_menu.KartuUjian

fun NavGraphBuilder.hasil_studi(navController: NavController){
    navigation(
        startDestination = Screen.HasilStudiScreen.route,
        route = "hasil_studi"
    ) {
        composable(route = Screen.HasilStudiScreen.route) {
            HasilStudi(navController = navController)
        }
    }
}