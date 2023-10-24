package com.b_labs.fiber

import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.staticCompositionLocalOf
import com.b_labs.fiber.theme.DesignSystem

class Design {
    var tokens: DesignSystem = DesignSystem()

    @Composable
    fun PrimaryButton() {
        Button(
            onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(containerColor = tokens.color.content.primary),

        ) {
            Text(text = "Click")
        }
    }
}

val localColors = staticCompositionLocalOf {
    com.b_labs.fiber.theme.ColorValuesContainer1()
}

object FiberTheme {
    val colors
        @Composable
        get() = localColors.current
}
