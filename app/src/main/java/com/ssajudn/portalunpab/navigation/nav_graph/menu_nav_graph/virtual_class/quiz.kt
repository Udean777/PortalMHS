package com.ssajudn.portalunpab.navigation.nav_graph.menu_nav_graph.virtual_class

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.ssajudn.portalunpab.navigation.Screen
import com.ssajudn.portalunpab.presentation.menu_screen.virtual_class.Quiz

fun NavGraphBuilder.quiz(navController: NavController) {
    navigation(
        startDestination = Screen.QuizScreen.route,
        route = "quiz"
    ) {
        composable(route = Screen.QuizScreen.route) {
            Quiz(navController = navController)
        }
    }
}