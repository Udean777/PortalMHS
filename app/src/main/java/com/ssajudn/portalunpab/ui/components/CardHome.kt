package com.ssajudn.portalunpab.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Photo
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ssajudn.portalunpab.ui.theme.DarkBlue
import com.ssajudn.portalunpab.ui.theme.DarkBlue2

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CardHome() {
    val gradient =
        Brush.horizontalGradient(listOf(DarkBlue, DarkBlue2))

    Card(
        onClick = { /*TODO*/ },
        modifier = Modifier
            .height(200.dp)
            .padding(vertical = 10.dp)
            .fillMaxWidth(),
        elevation = CardDefaults.elevatedCardElevation()
    ) {
        Box(
            modifier = Modifier
                .background(gradient)
                .fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Icon(
                    imageVector = Icons.Filled.Photo,
                    contentDescription = null,
                    tint = Color.White,
                    modifier = Modifier.size(50.dp)
                )
                Text(text = "Place your photo here", fontSize = 20.sp, color = Color.White)
            }
        }
    }
}