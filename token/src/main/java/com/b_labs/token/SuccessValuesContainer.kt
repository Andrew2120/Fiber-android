package com.b_labs.token

import android.graphics.Color.parseColor
import androidx.compose.ui.graphics.Color

data class SuccessValuesContainer(
    val actionSuccessNormal: Color = Color(parseColor("#347434")),
    val actionSuccessHover: Color = Color(parseColor("#246626")),
    val actionSuccessActive: Color = Color(parseColor("#135315")),
    val actionSuccessSelected: Color = Color(parseColor("#246626")),
    val actionSuccessSubtleNormal: Color = Color(parseColor("#e6f9e6")),
    val actionSuccessSubtleHover: Color = Color(parseColor("#dff6df")),
    val actionSuccessSubtleActive: Color = Color(parseColor("#c6ecc6")),
    val actionSuccessSubtleSelected: Color = Color(parseColor("#dff6df")),
    )
