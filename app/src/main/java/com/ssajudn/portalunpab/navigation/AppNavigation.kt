package com.ssajudn.portalunpab.navigation

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextOverflow
import androidx.navigation.NavController
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHost
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.ssajudn.portalunpab.navigation.nav_graph.home
//import com.ssajudn.portalunpab.navigation.nav_graph.login
import com.ssajudn.portalunpab.navigation.nav_graph.user

@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    val navBackStackEntry by navController.currentBackStackEntryAsState()

    val isBottomAppBarVisible = rememberSaveable(navBackStackEntry) {
        navBackStackEntry?.destination?.route == Screen.HomeScreen.route ||
                navBackStackEntry?.destination?.route == Screen.UserScreen.route
    }

    Scaffold(
        bottomBar = {
            if (isBottomAppBarVisible) {
                BottomNavBar(navController = navController)
            }
        }
    ) { contentPadding ->
        NavHost(
            modifier = Modifier
                .padding(contentPadding)
                .fillMaxSize(),
            navController = navController,
            startDestination = Tab.Home.route
        ) {
            home(navController = navController)
            user(navController = navController)
        }
    }
}

@Composable
private fun BottomNavBar(navController: NavController) {
    NavigationBar {
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentDestination = navBackStackEntry?.destination

        bottomNavBarTabs.forEach { tab ->
            val selected = currentDestination?.hierarchy?.any { it.route == tab.route } == true

            NavigationBarItem(
                selected = selected,
                onClick = {
                    navController.navigate(tab.route) {
                        popUpTo(navController.graph.findStartDestination().id) {
                            saveState = true
                        }
                        launchSingleTop = true
                        restoreState = true
                    }
                },
                icon = {
                    Icon(
                        imageVector = if (selected) tab.selectedIcon else tab.icon,
                        contentDescription = null
                    )
                },
                label = {
                    Text(text = tab.label, maxLines = 1, overflow = TextOverflow.Ellipsis)
                }
            )
        }
    }
}