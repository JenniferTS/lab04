package com.example.moviecounter

import androidx.compose.material3.Checkbox
import androidx.compose.runtime.*

@Composable
fun MiCheckbox() {
    var marcado by remember { mutableStateOf(false) }
    Checkbox(checked = marcado, onCheckedChange = { marcado = it })
}