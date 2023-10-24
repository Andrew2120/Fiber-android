package com.b_labs.fiber

import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

class Design {

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
