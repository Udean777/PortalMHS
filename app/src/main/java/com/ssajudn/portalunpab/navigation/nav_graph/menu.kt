package com.ssajudn.portalunpab.navigation.nav_graph

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.ssajudn.portalunpab.navigation.Screen
import com.ssajudn.portalunpab.navigation.Tab
import com.ssajudn.portalunpab.presentation.HomeScreen
import com.ssajudn.portalunpab.presentation.MenuScreen

fun NavGraphBuilder.menu(navController: NavController){
    navigation(
        startDestination = Screen.MenuScreen.route,
        route = "menu_graph"
    ) {
        composable(route = Screen.MenuScreen.route) {
            MenuScreen(navController = navController)
        }
    }
}