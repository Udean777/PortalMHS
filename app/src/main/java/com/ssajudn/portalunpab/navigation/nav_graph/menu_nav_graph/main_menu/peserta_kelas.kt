package com.ssajudn.portalunpab.navigation.nav_graph.menu_nav_graph.main_menu

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.ssajudn.portalunpab.navigation.Screen
import com.ssajudn.portalunpab.presentation.menu_screen.main_menu.KartuUjian
import com.ssajudn.portalunpab.presentation.menu_screen.main_menu.PesertaKelas

fun NavGraphBuilder.peserta_kelas(navController: NavController){
    navigation(
        startDestination = Screen.PesertaKelasScreen.route,
        route = "peserta_kelas"
    ) {
        composable(route = Screen.PesertaKelasScreen.route) {
            PesertaKelas(navController = navController)
        }
    }
}