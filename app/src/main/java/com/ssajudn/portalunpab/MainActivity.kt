package com.ssajudn.portalunpab

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.ssajudn.portalunpab.navigation.AppNavigation
import com.ssajudn.portalunpab.ui.components.StatusBarColor
import com.ssajudn.portalunpab.ui.theme.PortalUNPABTheme
import com.ssajudn.portalunpab.ui.theme.Primary

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PortalUNPABTheme {
                StatusBarColor(color = Primary)
                AppNavigation()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun AppPreview() {
    AppNavigation()
}