package com.ssajudn.portalunpab.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.outlined.AccountCircle
import androidx.compose.material.icons.outlined.Home
import androidx.compose.ui.graphics.vector.ImageVector

sealed class Screen(val route: String){
    data object HomeScreen : Screen("home")
//    data object LoginScreen : Screen("login")
    data object UserScreen : Screen("user")
}

sealed class Tab(
    val route: String,
    val icon: ImageVector,
    val selectedIcon: ImageVector,
    val label: String
){
    data object Home : Tab(
        route = "home_tab",
        icon = BottomAppBarIcons.HomeOutlined,
        selectedIcon = BottomAppBarIcons.HomeFilled,
        label = "Home"
    )

    data object User : Tab(
        route = "user_tab",
        icon = BottomAppBarIcons.userOutlined,
        selectedIcon = BottomAppBarIcons.userFilled,
        label = "User"
    )
}

private object BottomAppBarIcons {
    val HomeFilled = Icons.Filled.Home
    val HomeOutlined = Icons.Outlined.Home

    val userFilled = Icons.Filled.AccountCircle
    val userOutlined = Icons.Outlined.AccountCircle
}

val bottomNavBarTabs = listOf(
    Tab.Home,
    Tab.User
)