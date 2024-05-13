package com.ssajudn.portalunpab.navigation.nav_graph

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.ssajudn.portalunpab.navigation.Screen
import com.ssajudn.portalunpab.navigation.Tab
import com.ssajudn.portalunpab.presentation.HomeScreen

fun NavGraphBuilder.home(navController: NavController) {
    navigation(
        startDestination = Screen.HomeScreen.route,
        route = Tab.Home.route
    ) {
        composable(route = Screen.HomeScreen.route) {
            HomeScreen(navController = navController)
        }
    }
}