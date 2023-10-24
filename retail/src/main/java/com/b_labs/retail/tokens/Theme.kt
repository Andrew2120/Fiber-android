package com.b_labs.retail.tokens

import androidx.compose.ui.graphics.Color
import com.b_labs.token.ColorValuesContainer1
import com.b_labs.token.CoolGrayValuesContainer1
import com.b_labs.token.DesignSystem

val coolGray = CoolGrayValuesContainer1(
    negative4 = Color(0xFFFFDBDB),
)
val colorValuesContainer =
    ColorValuesContainer1(
        coolGray = coolGray,
    )
val designSystem = DesignSystem(
    colorValuesContainer,
)