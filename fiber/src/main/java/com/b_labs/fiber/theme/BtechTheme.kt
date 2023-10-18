package com.b_labs.fiber.theme

import ColorValuesContainer1
import DesignSystem
import androidx.compose.runtime.Composable
import androidx.compose.runtime.staticCompositionLocalOf

val LocalBtechColors = staticCompositionLocalOf {
    DesignSystem().color
}

val LocalBtechTypography = staticCompositionLocalOf {
    ColorValuesContainer1()
}

object BtechTheme {
    val typography
        @Composable
        get() = LocalBtechTypography.current

    val xcolors
        @Composable
        get() = LocalBtechColors.current
}