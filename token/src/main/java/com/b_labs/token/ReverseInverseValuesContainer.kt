package com.b_labs.token

import android.graphics.Color.parseColor
import androidx.compose.ui.graphics.Color

data class ReverseInverseValuesContainer(
    val actionReverseInverseNormal: Color = Color(parseColor("#0a121ae0")),
    val actionReverseInverseHover: Color = Color(parseColor("#1d2835cc")),
    val actionReverseInverseActive: Color = Color(parseColor("#182639bd")),
    val actionReverseInverseSelected: Color = Color(parseColor("#1d2835cc")),
    )
