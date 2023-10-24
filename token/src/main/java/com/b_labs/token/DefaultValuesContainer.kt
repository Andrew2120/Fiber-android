package com.b_labs.token

import android.graphics.Color.parseColor
import androidx.compose.ui.graphics.Color

data class DefaultValuesContainer(
    val interactionDefaultNormal: Color = Color(parseColor("#3061d5")),
    val interactionDefaultHover: Color = Color(parseColor("#1e4fc2")),
    val interactionDefaultActive: Color = Color(parseColor("#113997")),
    val interactionDefaultSelected: Color = Color(parseColor("#1e4fc2")),
    val interactionDefaultSubtleNormal: Color = Color(parseColor("#ebf0ff")),
    val interactionDefaultSubtleHover: Color = Color(parseColor("#e5eeff")),
    val interactionDefaultSubtleActive: Color = Color(parseColor("#ccdcff")),
    val interactionDefaultSubtleSelected: Color = Color(parseColor("#e5eeff")),
)