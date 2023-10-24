package com.b_labs.mylo.tokens

import android.graphics.Color.parseColor
import androidx.compose.ui.graphics.Color

data class GhostValuesContainer1(
    val interactionGhostNormal: Color = Color(parseColor("#ffffff00")),
    val interactionGhostHover: Color = Color(parseColor("#022e500f")),
    val interactionGhostActive: Color = Color(parseColor("#10284717")),
    val interactionGhostSelected: Color = Color(parseColor("#022e500f")),
    val interactionGhostInverseHover: Color = Color(parseColor("#ffffff1a")),
    val interactionGhostInverseNormal: Color = Color(parseColor("#ffffff1f")),
    val interactionGhostInverseSelected: Color = Color(parseColor("#ffffff1a")),
    val interactionGhostDangerHover: Color = Color(parseColor("#ffebeb")),
    val interactionGhostDangerNormal: Color = Color(parseColor("#fee7e7")),
    val interactionGhostDangerSelected: Color = Color(parseColor("#ffebeb")),
)