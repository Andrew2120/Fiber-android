package com.b_labs.fiber

import androidx.compose.foundation.background
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

class Design(private val design: DesignSystem) {

    @Composable
    fun PrimaryButton() {
        Button(onClick = { /*TODO*/ }, modifier = Modifier.background(design.color.green.green0)) {
            Text(text = "Click")
        }
    }
}