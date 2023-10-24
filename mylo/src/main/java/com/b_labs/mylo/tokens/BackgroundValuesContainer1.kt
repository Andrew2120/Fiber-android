package com.b_labs.mylo.tokens

import android.graphics.Color.parseColor
import androidx.compose.ui.graphics.Color

data class BackgroundValuesContainer1(
    val interactionBackgroundModal: Color = Color(parseColor("#ffffff")),
    val interactionBackgroundModeless: Color = Color(parseColor("#ffffff")),
    val interactionBackgroundModelessInverse: Color = Color(parseColor("#272e35")),
    val interactionBackgroundSidepanel: Color = Color(parseColor("#ffffff")),
    val interactionBackgroundFormField: Color = Color(parseColor("#ffffff")),
    val interactionBackgroundDimmer: Color = Color(parseColor("#182639bd")),
)