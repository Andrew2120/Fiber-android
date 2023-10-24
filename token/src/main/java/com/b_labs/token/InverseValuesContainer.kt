package com.b_labs.token

import android.graphics.Color.parseColor
import androidx.compose.ui.graphics.Color

data class InverseValuesContainer(
    val actionInverseNormal: Color = Color(parseColor("#ffffff")),
    val actionInverseHover: Color = Color(parseColor("#ffffffd1")),
    val actionInverseActive: Color = Color(parseColor("#ffffffb8")),
    val actionInverseSelected: Color = Color(parseColor("#ffffffd1")),
    )
