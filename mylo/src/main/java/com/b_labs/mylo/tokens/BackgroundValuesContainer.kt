package com.b_labs.mylo.tokens

import android.graphics.Color.parseColor
import androidx.compose.ui.graphics.Color

data class BackgroundValuesContainer(
    val default: Color = Color(parseColor("#ffffff")),
    val inverse: Color = Color(parseColor("#272e35")),
    val neutralStrong: Color = Color(parseColor("#555f6d")),
    val neutralMuted: Color = Color(parseColor("#dee3e7")),
    val neutralOnSubtle: Color = Color(parseColor("#eaedf0")),
    val neutralSubtle: Color = Color(parseColor("#f5f7f9")),
    val neutralSurface: Color = Color(parseColor("#fcfcfd")),
    val infoStrong: Color = Color(parseColor("#3061d5")),
    val infoMuted: Color = Color(parseColor("#d6e3ff")),
    val infoOnSubtle: Color = Color(parseColor("#e5eeff")),
    val infoSubtle: Color = Color(parseColor("#f5f8ff")),
    val infoSurface: Color = Color(parseColor("#fafbff")),
    val successStrong: Color = Color(parseColor("#347434")),
    val successMuted: Color = Color(parseColor("#cff2cf")),
    val successOnSubtle: Color = Color(parseColor("#dff6df")),
    val successSubtle: Color = Color(parseColor("#f4fbf4")),
    val successSurface: Color = Color(parseColor("#fbfefb")),
    val warningStrong: Color = Color(parseColor("#f59638")),
    val warningMuted: Color = Color(parseColor("#fcdec0")),
    val warningOnSubtle: Color = Color(parseColor("#ffe8d1")),
    val warningSubtle: Color = Color(parseColor("#fff5eb")),
    val warningSurface: Color = Color(parseColor("#fffcfa")),
    val dangerStrong: Color = Color(parseColor("#c53434")),
    val dangerMuted: Color = Color(parseColor("#fcd9d9")),
    val dangerOnSubtle: Color = Color(parseColor("#fee7e7")),
    val dangerSubtle: Color = Color(parseColor("#fef5f5")),
    val dangerSurface: Color = Color(parseColor("#fffafa")),
    val brandStrong: Color = Color(parseColor("#3061d5")),
    val brandMuted: Color = Color(parseColor("#d6e3ff")),
    val brandOnSubtle: Color = Color(parseColor("#e5eeff")),
    val brandSurface: Color = Color(parseColor("#fafbff")),
    val brandSubtle: Color = Color(parseColor("#f5f8ff")),
)