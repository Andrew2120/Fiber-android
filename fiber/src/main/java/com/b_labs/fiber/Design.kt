package com.b_labs.fiber

import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

class Design(private val design: DesignTheme) {

    @Composable
    fun PrimaryButton() {
        Button(
            onClick = { /*TODO*/ },

            colors = ButtonDefaults.buttonColors(containerColor = design.primaryColor),

        ) {
            Text(text = "Click")
        }
    }
}

data class DesignTheme(
    val primaryColor: Color,
    val secondaryColor: Color,
)