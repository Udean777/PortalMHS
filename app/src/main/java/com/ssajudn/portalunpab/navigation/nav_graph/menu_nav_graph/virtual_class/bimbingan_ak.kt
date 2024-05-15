package com.ssajudn.portalunpab.navigation.nav_graph.menu_nav_graph.virtual_class

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.ssajudn.portalunpab.navigation.Screen
import com.ssajudn.portalunpab.presentation.menu_screen.virtual_class.BimbinganAK

fun NavGraphBuilder.bimbingan_ak(navController: NavController){
    navigation(
        startDestination = Screen.BimbinganAKScreen.route,
        route = "bimbingan_ak_graph"
    ){
        composable(route = Screen.BimbinganAKScreen.route){
            BimbinganAK(navController = navController)
        }
    }
}