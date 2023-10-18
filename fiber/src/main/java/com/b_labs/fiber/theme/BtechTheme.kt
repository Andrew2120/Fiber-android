package com.b_labs.fiber.theme

import ColorValuesContainer1
import androidx.compose.runtime.Composable
import androidx.compose.runtime.staticCompositionLocalOf

val LocalBtechColors = staticCompositionLocalOf {
    ColorValuesContainer1()
}

val LocalBtechTypography = staticCompositionLocalOf {
    ColorValuesContainer1()
}

object BtechTheme {
    val typography
        @Composable
        get() = LocalBtechTypography.current

    val colors
        @Composable
        get() = LocalBtechColors.current
}