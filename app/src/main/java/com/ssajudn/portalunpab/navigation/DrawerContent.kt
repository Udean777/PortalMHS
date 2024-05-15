package com.ssajudn.portalunpab.navigation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.NavigationDrawerItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.currentBackStackEntryAsState
import com.ssajudn.portalunpab.dummy_data.menuList
import com.ssajudn.portalunpab.ui.theme.BlueTransparent

@Composable
fun DrawerContent(navController: NavController, closeDrawer: () -> Unit) {
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route

    Column(
        modifier = Modifier.padding(16.dp)
    ) {
        menuList.forEach { menu ->
            Text(
                text = menu.title,
                style = MaterialTheme.typography.headlineSmall,
                modifier = Modifier.padding(vertical = 8.dp),
                fontWeight = FontWeight.Bold
            )
            menu.subMenus.forEach { subMenu ->
                NavigationDrawerItem(
                    label = {
                        Text(text = subMenu.title)
                    },
                    selected = currentRoute == subMenu.screenName,
                    onClick = {
                        navController.navigate(subMenu.screenName) {
                            popUpTo(navController.graph.findStartDestination().id) {
                                saveState = true
                            }
                            launchSingleTop = true
                            restoreState = true
                        }
                        closeDrawer()
                    },
                    modifier = Modifier.padding(NavigationDrawerItemDefaults.ItemPadding),
                    icon = {
                        Icon(imageVector = subMenu.icon, contentDescription = null)
                    },
                    colors = NavigationDrawerItemDefaults.colors(BlueTransparent)
                )
            }
        }
    }
}