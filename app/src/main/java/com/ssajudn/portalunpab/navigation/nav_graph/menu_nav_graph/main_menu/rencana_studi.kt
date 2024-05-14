package com.ssajudn.portalunpab.navigation.nav_graph.menu_nav_graph.main_menu

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.ssajudn.portalunpab.navigation.Screen
import com.ssajudn.portalunpab.navigation.Tab
import com.ssajudn.portalunpab.presentation.HomeScreen
import com.ssajudn.portalunpab.presentation.menu_screen.main_menu.RencanaStudiScreen

fun NavGraphBuilder.rencana_studi(navController: NavController){
    navigation(
        startDestination = Screen.RencanaStudiScreen.route,
        route = "rencana_studi"
    ) {
        composable(route = Screen.RencanaStudiScreen.route) {
            RencanaStudiScreen(navController = navController)
        }
    }
}