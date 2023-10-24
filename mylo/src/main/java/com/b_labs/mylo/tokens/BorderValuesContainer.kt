package com.b_labs.mylo.tokens

import android.graphics.Color.parseColor
import androidx.compose.ui.graphics.Color

data class BorderValuesContainer(
    val default: Color = Color(parseColor("#eaedf0")),
    val defaultA: Color = Color(parseColor("#10284717")),
    val inverse: Color = Color(parseColor("#ffffff")),
    val neutralStrong: Color = Color(parseColor("#555f6d")),
    val neutralSubtle: Color = Color(parseColor("#cfd6dd")),
    val infoStrong: Color = Color(parseColor("#3061d5")),
    val infoSubtle: Color = Color(parseColor("#ccdcff")),
    val successStrong: Color = Color(parseColor("#347434")),
    val successSubtle: Color = Color(parseColor("#c6ecc6")),
    val warningStrong: Color = Color(parseColor("#f59638")),
    val warningSubtle: Color = Color(parseColor("#ffd4a8")),
    val dangerStrong: Color = Color(parseColor("#c53434")),
    val dangerSubtle: Color = Color(parseColor("#fccfcf")),
)