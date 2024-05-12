package com.ssajudn.portalunpab

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.ssajudn.portalunpab.navigation.AppNavigator
import com.ssajudn.portalunpab.presentation.LoginScreen
import com.ssajudn.portalunpab.ui.StatusBarColor
import com.ssajudn.portalunpab.ui.theme.PortalUNPABTheme
import com.ssajudn.portalunpab.ui.theme.Primary

class MainActivity : ComponentActivity() {

    lateinit var navController: NavHostController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PortalUNPABTheme {
                StatusBarColor(color = Primary)
                navController = rememberNavController()
                AppNavigator(navController = navController)
            }
        }
    }
}