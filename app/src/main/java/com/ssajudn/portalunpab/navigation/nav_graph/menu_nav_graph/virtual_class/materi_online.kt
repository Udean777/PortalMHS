package com.ssajudn.portalunpab.navigation.nav_graph.menu_nav_graph.virtual_class

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.ssajudn.portalunpab.navigation.Screen
import com.ssajudn.portalunpab.presentation.menu_screen.virtual_class.MateriOnline

fun NavGraphBuilder.materi_online(navController: NavController) {
    navigation(
        startDestination = Screen.MateriOnlineScreen.route,
        route = "materi_online_graph"
    ) {
        composable(
            route = Screen.MateriOnlineScreen.route
        ) {
            MateriOnline(navController = navController)
        }
    }
}