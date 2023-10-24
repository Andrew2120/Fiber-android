package com.b_labs.mylo.tokens

import android.graphics.Color.parseColor
import androidx.compose.ui.graphics.Color

data class GhostValuesContainer(
    val actionGhostNormal: Color = Color(parseColor("#ffffff00")),
    val actionGhostHover: Color = Color(parseColor("#022e500f")),
    val actionGhostActive: Color = Color(parseColor("#10284717")),
    val actionGhostSelected: Color = Color(parseColor("#022e500f")),
    val actionGhostInverseHover: Color = Color(parseColor("#ffffff1a")),
    val actionGhostInverseActive: Color = Color(parseColor("#ffffff1f")),
    val actionGhostInverseSelected: Color = Color(parseColor("#ffffff1a")),
    val actionGhostDangerHover: Color = Color(parseColor("#ffebeb")),
    val actionGhostDangerActive: Color = Color(parseColor("#fee7e7")),
    val actionGhostDangerSelected: Color = Color(parseColor("#ffebeb")),
)