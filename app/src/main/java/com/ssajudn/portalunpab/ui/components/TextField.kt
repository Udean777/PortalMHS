package com.ssajudn.portalunpab.ui.components

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun TextField(
    modifier: Modifier = Modifier
) {
    OutlinedTextField(
        value = "",
        onValueChange = {},
        placeholder = { Text(text = "Username") },
        modifier = modifier.fillMaxWidth()
    )
    Spacer(modifier = modifier.size(20.dp))
    OutlinedTextField(
        value = "",
        onValueChange = {},
        placeholder = { Text(text = "Password") },
        modifier = modifier.fillMaxWidth()
    )
}
