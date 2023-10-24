package com.b_labs.mylo.tokens

import android.graphics.Color.parseColor
import androidx.compose.ui.graphics.Color

data class NeutralValuesContainer1(
    val interactionNeutralNormal: Color = Color(parseColor("#4a545e")),
    val interactionNeutralHover: Color = Color(parseColor("#3a424a")),
    val interactionNeutralActive: Color = Color(parseColor("#272e35")),
    val interactionNeutralSelected: Color = Color(parseColor("#3a424a")),
    val interactionNeutralSubtleNormal: Color = Color(parseColor("#f0f3f5")),
    val interactionNeutralSubtleHover: Color = Color(parseColor("#eaedf0")),
    val interactionNeutralSubtleActive: Color = Color(parseColor("#cfd6dd")),
    val interactionNeutralSubtleSelected: Color = Color(parseColor("#eaedf0")),
)