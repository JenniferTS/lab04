package com.example.moviecounter

import androidx.compose.material3.Switch
import androidx.compose.runtime.*

@Composable
fun MiSwitch() {
    var activo by remember { mutableStateOf(false) }
    Switch(checked = activo, onCheckedChange = { activo = it })
}