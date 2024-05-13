package com.ssajudn.portalunpab.navigation.nav_graph

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.ssajudn.portalunpab.navigation.Screen
import com.ssajudn.portalunpab.navigation.Tab
import com.ssajudn.portalunpab.presentation.PaymentScreen

fun NavGraphBuilder.payment(navController: NavController) {
    navigation(
        startDestination = Screen.PaymentScreen.route,
        route = Tab.Payment.route
    ) {
        composable(route = Screen.PaymentScreen.route) {
            PaymentScreen(navController = navController)
        }
    }
}