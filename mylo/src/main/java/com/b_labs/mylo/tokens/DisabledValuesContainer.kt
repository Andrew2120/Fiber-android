package com.b_labs.mylo.tokens

import android.graphics.Color.parseColor
import androidx.compose.ui.graphics.Color

data class DisabledValuesContainer(
    val interactionDisabledNormal: Color = Color(parseColor("#9ea8b3")),
    val interactionDisabledHover: Color = Color(parseColor("#7e8c9a")),
    val interactionDisabledActive: Color = Color(parseColor("#555f6d")),
    val interactionDisabledSubtleNormal: Color = Color(parseColor("#eaedf0")),
    val interactionDisabledSubtleHover: Color = Color(parseColor("#dee3e7")),
    val interactionDisabledSubtleActive: Color = Color(parseColor("#cfd6dd")),
)
