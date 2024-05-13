package com.ssajudn.portalunpab.navigation.nav_graph

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.ssajudn.portalunpab.navigation.Screen
import com.ssajudn.portalunpab.navigation.Tab
import com.ssajudn.portalunpab.presentation.UserScreen

fun NavGraphBuilder.user(navController: NavController) {
    navigation(
        startDestination = Screen.UserScreen.route,
        route = Tab.User.route
    ) {
        composable(route = Screen.UserScreen.route) {
            UserScreen(navController = navController)
        }
    }
}