package com.b_labs.token

import android.graphics.Color.parseColor
import androidx.compose.ui.graphics.Color

data class BorderValuesContainer1(
    val interactionBorderNormal: Color = Color(parseColor("#8eb0fb")),
    val interactionBorderHover: Color = Color(parseColor("#6691f4")),
    val interactionBorderActive: Color = Color(parseColor("#2759ce")),
    val interactionBorderSelected: Color = Color(parseColor("#3061d5")),
    val interactionBorderNeutralNormal: Color = Color(parseColor("#cfd6dd")),
    val interactionBorderNeutralHover: Color = Color(parseColor("#9ea8b3")),
    val interactionBorderNeutralActive: Color = Color(parseColor("#7e8c9a")),
    val interactionBorderNeutralSelected: Color = Color(parseColor("#9ea8b3")),
    val interactionBorderDanger: Color = Color(parseColor("#f26363")),
    )
