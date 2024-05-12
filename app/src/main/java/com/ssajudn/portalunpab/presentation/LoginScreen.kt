package com.ssajudn.portalunpab.presentation

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.ssajudn.portalunpab.R
import com.ssajudn.portalunpab.navigation.Screen
import com.ssajudn.portalunpab.presentation.components.TextField
import com.ssajudn.portalunpab.ui.StatusBarColor
import com.ssajudn.portalunpab.ui.theme.Grey
import com.ssajudn.portalunpab.ui.theme.Primary

@Composable
fun LoginScreen(navController: NavHostController) {
    StatusBarColor(color = Primary)

    Box(modifier = Modifier.fillMaxSize()) {
        Canvas(
            modifier = Modifier
                .fillMaxWidth()
                .height(130.dp)
        ) {
            val topLeft = Offset(0f, 0f)
            val topRight = Offset(size.width, 0f)
            val bottomLeft = Offset(0f, size.height)
            val bottomRight = Offset(size.width, size.height)

            drawPath(
                path = Path().apply {
                    moveTo(topLeft.x, topLeft.y)
                    lineTo(topRight.x, topRight.y)
                    lineTo(bottomRight.x, bottomRight.y - 200f)
                    lineTo(bottomLeft.x, bottomLeft.y - 20f)
                    close()
                },
                color = Primary,
            )
        }

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 30.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.logo_pancabudi),
                contentDescription = null,
                modifier = Modifier
                    .background(Grey, shape = CircleShape)
                    .padding(25.dp)
                    .size(130.dp)
            )
            Spacer(modifier = Modifier.size(20.dp))
            TextField()
            Spacer(modifier = Modifier.size(20.dp))
            Button(
                onClick = {
                    navController.navigate(Screen.HomeScreen.route)
                },
                modifier = Modifier.fillMaxWidth(),
                colors = ButtonDefaults.buttonColors(Primary)
            ) {
                Text(text = "Login")
            }
        }
    }
}