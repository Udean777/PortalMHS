package com.ssajudn.portalunpab.navigation

//import com.ssajudn.portalunpab.navigation.nav_graph.login
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.ssajudn.portalunpab.navigation.nav_graph.home
import com.ssajudn.portalunpab.navigation.nav_graph.menu
import com.ssajudn.portalunpab.navigation.nav_graph.menu_nav_graph.main_menu.rencana_studi
import com.ssajudn.portalunpab.navigation.nav_graph.payment
import com.ssajudn.portalunpab.navigation.nav_graph.user
import com.ssajudn.portalunpab.presentation.components.TopAppBarHome
import com.ssajudn.portalunpab.ui.components.StatusBarColor
import com.ssajudn.portalunpab.ui.theme.DarkBlue

@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    val navBackStackEntry by navController.currentBackStackEntryAsState()

    val isBottomAppBarVisible = rememberSaveable(navBackStackEntry) {
        navBackStackEntry?.destination?.route == Screen.HomeScreen.route ||
                navBackStackEntry?.destination?.route == Screen.PaymentScreen.route ||
                navBackStackEntry?.destination?.route == Screen.UserScreen.route
    }
    StatusBarColor(color = DarkBlue)

    Scaffold(
        topBar = {
            if (navController.currentBackStackEntry?.destination?.route == "home") {
                TopAppBarHome(navController = navController)
            }
        },
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
            payment(navController = navController)
            user(navController = navController)
            menu(navController = navController)
            rencana_studi(navController = navController)
        }
    }
}

@Preview
@Composable
private fun AppPreview() {
    AppNavigation()
}

@Composable
private fun BottomNavBar(navController: NavController) {
    NavigationBar(
        containerColor = DarkBlue,
    ) {
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
                        contentDescription = null,
                        tint = if (selected) Color.Black else Color.White
                    )
                },
                label = {
                    Text(
                        text = tab.label,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis,
                        color = Color.White
                    )
                },
                colors = NavigationBarItemDefaults.colors(
                    indicatorColor = Color.White
                )
            )
        }
    }
}