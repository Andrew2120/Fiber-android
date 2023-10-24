package com.b_labs.mylo.tokens

import android.graphics.Color.parseColor
import androidx.compose.ui.graphics.Color

data class DangerValuesContainer1(
    val interactionDangerNormal: Color = Color(parseColor("#c53434")),
    val interactionDangerHover: Color = Color(parseColor("#952d2d")),
    val interactionDangerActive: Color = Color(parseColor("#6f2020")),
    val interactionDangerSelected: Color = Color(parseColor("#952d2d")),
    val interactionDangerSubtleNormal: Color = Color(parseColor("#ffebeb")),
    val interactionDangerSubtleHover: Color = Color(parseColor("#fee7e7")),
    val interactionDangerSubtleActive: Color = Color(parseColor("#fccfcf")),
    val interactionDangerSubtleSelected: Color = Color(parseColor("#fee7e7")),
)
