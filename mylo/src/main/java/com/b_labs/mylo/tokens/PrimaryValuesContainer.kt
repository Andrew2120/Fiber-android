package com.b_labs.mylo.tokens

import android.graphics.Color.parseColor
import androidx.compose.ui.graphics.Color

data class PrimaryValuesContainer(
    val actionPrimaryNormal: Color = Color(parseColor("#3061d5")),
    val actionPrimaryHover: Color = Color(parseColor("#1e4fc2")),
    val actionPrimaryActive: Color = Color(parseColor("#113997")),
    val actionPrimarySelected: Color = Color(parseColor("#1e4fc2")),
    val actionPrimarySubtleNormal: Color = Color(parseColor("#ebf0ff")),
    val actionPrimarySubtleHover: Color = Color(parseColor("#e5eeff")),
    val actionPrimarySubtleActive: Color = Color(parseColor("#ccdcff")),
    val actionPrimarySubtleSelected: Color = Color(parseColor("#e5eeff")),
)
