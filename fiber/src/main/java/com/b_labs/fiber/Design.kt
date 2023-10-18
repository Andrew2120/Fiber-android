package com.b_labs.fiber

import DesignSystem
import androidx.compose.foundation.background
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.b_labs.fiber.theme.BtechTheme

class Design(private val design: DesignSystem) {

    @Composable
    fun PrimaryButton() {
        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier.background(BtechTheme.colors.coolGray.negative4),
        ) {
            Text(text = "Click")
        }
    }
}
