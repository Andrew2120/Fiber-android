package com.b_labs.fiber

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp

data class DesignTheme(
    val primaryColor: Color,
    val secondaryColor: Color,
    val sizing: Sizing,
    val spacing: Spacing,
)

data class Sizing(
    val size3xLarge: Dp,
    val size2xLarge: Dp,
    val xLarge: Dp,
    val large: Dp,
    val medium: Dp,
    val small: Dp,
    val xSmall: Dp,
    val size2xSmall: Dp,
    val size3xSmall: Dp,
)

data class Spacing(
    val padding: Padding,
    val gap: Gap,
)

data class Padding(
    val none: Dp,
    val padding2xSmall: Dp,
    val xSmall: Dp,
    val small: Dp,
    val medium: Dp,
    val large: Dp,
    val padding2xLarge: Dp,
    val padding3xLarge: Dp,
)

data class Gap(
    val none: Dp,
    val gap2xSmall: Dp,
    val xSmall: Dp,
    val small: Dp,
    val medium: Dp,
    val large: Dp,
    val xLarge: Dp,
    val gap2xLarge: Dp,
)
