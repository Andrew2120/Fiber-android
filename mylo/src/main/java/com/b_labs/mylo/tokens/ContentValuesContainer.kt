package com.b_labs.mylo.tokens

import android.graphics.Color.parseColor
import androidx.compose.ui.graphics.Color

data class ContentValuesContainer(
    val primary: Color = Color(parseColor("#272e35")),
    val secondary: Color = Color(parseColor("#555f6d")),
    val tertiary: Color = Color(parseColor("#7e8c9a")),
    val disabled: Color = Color(parseColor("#9ea8b3")),
    val primaryInverse: Color = Color(parseColor("#ffffff")),
    val secondaryInverse: Color = Color(parseColor("#ffffffa3")),
    val tertiaryInverse: Color = Color(parseColor("#ffffff66")),
    val disabledInverse: Color = Color(parseColor("#ffffff3d")),
    val infoPrimary: Color = Color(parseColor("#113997")),
    val infoSecondary: Color = Color(parseColor("#3061d5")),
    val successPrimary: Color = Color(parseColor("#135315")),
    val successSecondary: Color = Color(parseColor("#347434")),
    val warningPrimary: Color = Color(parseColor("#7a4510")),
    val warningSecondary: Color = Color(parseColor("#f59638")),
    val dangerPrimary: Color = Color(parseColor("#6f2020")),
    val dangerSecondary: Color = Color(parseColor("#c53434")),
    val brandPrimary: Color = Color(parseColor("#113997")),
    val brandSecondary: Color = Color(parseColor("#3061d5")),
)