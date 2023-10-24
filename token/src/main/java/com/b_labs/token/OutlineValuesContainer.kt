package com.b_labs.token

import android.graphics.Color.parseColor
import androidx.compose.ui.graphics.Color

data class OutlineValuesContainer(
    val actionOutlineNormal: Color = Color(parseColor("#cfd6dd")),
    val actionOutlineHover: Color = Color(parseColor("#9ea8b3")),
    val actionOutlineActive: Color = Color(parseColor("#7e8c9a")),
    val actionOutlineSelected: Color = Color(parseColor("#9ea8b3")),
    )
