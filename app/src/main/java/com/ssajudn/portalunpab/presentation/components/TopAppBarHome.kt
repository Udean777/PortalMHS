package com.ssajudn.portalunpab.presentation.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.Logout
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ssajudn.portalunpab.ui.theme.DarkBlue

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopAppBarHome(showDialog: MutableState<Boolean>) {
    TopAppBar(
        title = {
            Column {
                Text(
                    text = "Selamat Datang",
                    fontSize = 15.sp,
                    color = Color.White
                )
                Text(
                    text = "Sajudin",
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White
                )
            }
        },
        actions = {
            IconButton(
                onClick = {
                    showDialog.value = true
                },
            ) {
                Icon(
                    imageVector = Icons.AutoMirrored.Filled.Logout,
                    contentDescription = null,
                    tint = Color.White,
                    modifier = Modifier.size(20.dp),
                )
            }
        },
        colors = TopAppBarDefaults.topAppBarColors(DarkBlue)
    )
}