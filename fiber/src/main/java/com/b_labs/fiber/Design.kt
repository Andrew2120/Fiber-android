package com.b_labs.fiber

import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.b_labs.token.FiberTheme

class Design {
    @Composable
    fun PrimaryButton() {
        Button(
            onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(containerColor = FiberTheme.colors.color.coolGray.negative4),

        ) {
            Text(text = "Click")
        }
    }
}
