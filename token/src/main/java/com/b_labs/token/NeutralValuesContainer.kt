package com.b_labs.token

import android.graphics.Color.parseColor
import androidx.compose.ui.graphics.Color

data class NeutralValuesContainer(
    val actionNeutralNormal: Color = Color(parseColor("#4a545e")),
    val actionNeutralHover: Color = Color(parseColor("#3a424a")),
    val actionNeutralActive: Color = Color(parseColor("#272e35")),
    val actionNeutralSelected: Color = Color(parseColor("#3a424a")),
    val actionNeutralSubtleNormal: Color = Color(parseColor("#f0f3f5")),
    val actionNeutralSubtleHover: Color = Color(parseColor("#eaedf0")),
    val actionNeutralSubtleActive: Color = Color(parseColor("#cfd6dd")),
    val actionNeutralSubtleSelected: Color = Color(parseColor("#eaedf0")),
    )
