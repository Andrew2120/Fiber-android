package com.b_labs.token

import android.graphics.Color.parseColor
import androidx.compose.ui.graphics.Color

data class InverseValuesContainer1(
    val interactionInverseNormal: Color = Color(parseColor("#ffffff")),
    val interactionInverseHover: Color = Color(parseColor("#ffffffd1")),
    val interactionInverseActive: Color = Color(parseColor("#ffffffb8")),
    val interactionInverseSelected: Color = Color(parseColor("#ffffffd1")),
    )
