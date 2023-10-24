package com.b_labs.mylo.tokens

import android.graphics.Color.parseColor
import androidx.compose.ui.graphics.Color

data class DangerValuesContainer(
    val actionDangerNormal: Color = Color(parseColor("#c53434")),
    val actionDangerHover: Color = Color(parseColor("#952d2d")),
    val actionDangerActive: Color = Color(parseColor("#6f2020")),
    val actionDangerSelected: Color = Color(parseColor("#952d2d")),
    val actionDangerSubtleNormal: Color = Color(parseColor("#ffebeb")),
    val actionDangerSubtleHover: Color = Color(parseColor("#fee7e7")),
    val actionDangerSubtleActive: Color = Color(parseColor("#fccfcf")),
    val actionDangerSubtleSelected: Color = Color(parseColor("#fee7e7")),
)