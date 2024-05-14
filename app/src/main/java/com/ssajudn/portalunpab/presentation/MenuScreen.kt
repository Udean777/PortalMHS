package com.ssajudn.portalunpab.presentation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBackIosNew
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavGraph.Companion.findStartDestination
import com.ssajudn.portalunpab.dummy_data.menuList
import com.ssajudn.portalunpab.navigation.Screen
import com.ssajudn.portalunpab.ui.theme.DarkBlue

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MenuScreen(navController: NavController) {

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Column {
                        IconButton(
                            onClick = {
                                navController.popBackStack()
                            },
                        ) {
                            Icon(
                                imageVector = Icons.Filled.ArrowBackIosNew,
                                contentDescription = null,
                                tint = Color.White,
                                modifier = Modifier.size(20.dp),
                            )
                        }
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(DarkBlue)
            )
        }
    ) { contentPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(contentPadding),
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.Top
        ) {
            menuList.forEach { menu ->
                Text(
                    text = menu.title,
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp,
                    modifier = Modifier.padding(10.dp)
                )
                menu.subMenus.forEach { subMenu ->
                    TextButton(
                        onClick = {
                            navController.navigate(subMenu.screenName){
                                popUpTo(navController.graph.findStartDestination().id) {
                                    saveState = true
                                }
                                launchSingleTop = true
                                restoreState = true
                            }
                        }
                    ) {
                        Text(
                            text = subMenu.title,
                            modifier = Modifier.padding(
                                start = 10.dp,
                                top = 4.dp,
                                bottom = 4.dp
                            )
                        )
                    }
                }
            }
        }
    }
}