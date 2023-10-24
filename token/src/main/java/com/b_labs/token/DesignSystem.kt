package com.b_labs.token

import androidx.compose.runtime.Composable
import androidx.compose.runtime.staticCompositionLocalOf

data class DesignSystem(
    val color: ColorValuesContainer1 = ColorValuesContainer1(),
    val borderWidth: BorderWidthValuesContainer1 = BorderWidthValuesContainer1(),
    val borderRadius: BorderRadiusValuesContainer1 = BorderRadiusValuesContainer1(),
    val size: SizeValuesContainer1 = SizeValuesContainer1(),
    val space: SpaceValuesContainer1 = SpaceValuesContainer1(),
    val opacity: OpacityValuesContainer1 = OpacityValuesContainer1(),
    val typography: TypographyValuesContainer1 = TypographyValuesContainer1(),
    val dimension: DimensionValuesContainer1 = DimensionValuesContainer1(),
    val elevation: ElevationValuesContainer1 = ElevationValuesContainer1(),
    val fontFamily: FontFamilyValuesContainer1 = FontFamilyValuesContainer1(),
    val fontSize: FontSizeValuesContainer1 = FontSizeValuesContainer1(),
    val fontWeight: FontWeightValuesContainer1 = FontWeightValuesContainer1(),
    val letterSpacing: LetterSpacingValuesContainer1 = LetterSpacingValuesContainer1(),
    val lineHeight: LineHeightValuesContainer1 = LineHeightValuesContainer1(),
)

val localColors = staticCompositionLocalOf {
    DesignSystem()
}

object FiberTheme {
    val colors
        @Composable
        get() = localColors.current
}

data class GapValuesContainer1(
    val none: Double = 0.0,
    val gap2xSmall: Double = 2.0,
    val xSmall: Double = 4.0,
    val small: Double = 8.0,
    val medium: Double = 12.0,
    val large: Double = 16.0,
    val xLarge: Double = 24.0,
    val gap2xLarge: Double = 32.0,
    val gap3xLarge: Double = 44.0,
)

data class SpaceValuesContainer1(
    val padding: PaddingValuesContainer1 = PaddingValuesContainer1(),
    val gap: GapValuesContainer1 = GapValuesContainer1(),
)

data class OpacityValuesContainer1(
    val disabled: Double = 0.5,
    val opacity0: Double = 0.0,
    val opacity50: Double = 0.5,
    val opacity100: Double = 1.0,
)

data class CodeValuesContainer1(
    val typographyCodeSmall: Typography = Typography(
        lineHeight = 16.0,
        letterSpacing = 0.0,
        fontWeight = 400.0,
        fontSize = 12.0,
        fontFamily = "Noto Sans Mono",
    ),
    val typographyCodeMedium: Typography = Typography(
        lineHeight = 20.0,
        letterSpacing = -0.006,
        fontWeight = 400.0,
        fontSize = 14.0,
        fontFamily = "Noto Sans Mono",
    ),
    val typographyCodeLarge: Typography = Typography(
        lineHeight = 22.0,
        letterSpacing = -0.011,
        fontWeight = 400.0,
        fontSize = 16.0,
        fontFamily = "Noto Sans Mono",
    ),
)

data class UtilityValuesContainer1(
    val typographyUtilitySmall: Typography = Typography(
        lineHeight = 16.0,
        letterSpacing = 0.0,
        fontWeight = 500.0,
        fontSize = 12.0,
        fontFamily = "Noto Sans",
    ),
    val typographyUtilityMedium: Typography = Typography(
        lineHeight = 20.0,
        letterSpacing = -0.006,
        fontWeight = 500.0,
        fontSize = 14.0,
        fontFamily = "Noto Sans",
    ),
    val typographyUtilityLarge: Typography = Typography(
        lineHeight = 22.0,
        letterSpacing = -0.011,
        fontWeight = 500.0,
        fontSize = 16.0,
        fontFamily = "Noto Sans",
    ),
)

data class BodyValuesContainer1(
    val typographyBodySmall: Typography = Typography(
        lineHeight = 16.0,
        letterSpacing = 0.0,
        fontWeight = 400.0,
        fontSize = 12.0,
        fontFamily = "Noto Sans",
    ),
    val typographyBodyMedium: Typography = Typography(
        lineHeight = 20.0,
        letterSpacing = -0.006,
        fontWeight = 400.0,
        fontSize = 14.0,
        fontFamily = "Noto Sans",
    ),
    val typographyBodyLarge: Typography = Typography(
        lineHeight = 22.0,
        letterSpacing = -0.011,
        fontWeight = 400.0,
        fontSize = 16.0,
        fontFamily = "Noto Sans",
    ),
)

data class HeadingValuesContainer1(
    val typographyHeadingSmall: Typography = Typography(
        lineHeight = 16.0,
        letterSpacing = 0.0,
        fontWeight = 700.0,
        fontSize = 12.0,
        fontFamily = "Noto Sans",
    ),
    val typographyHeadingMedium: Typography = Typography(
        lineHeight = 20.0,
        letterSpacing = -0.006,
        fontWeight = 700.0,
        fontSize = 14.0,
        fontFamily = "Noto Sans",
    ),
    val typographyHeadingLarge: Typography = Typography(
        lineHeight = 22.0,
        letterSpacing = -0.011,
        fontWeight = 700.0,
        fontSize = 16.0,
        fontFamily = "Noto Sans",
    ),
    val typographyHeadingXLarge: Typography = Typography(
        lineHeight = 24.0,
        letterSpacing = -0.014,
        fontWeight = 700.0,
        fontSize = 18.0,
        fontFamily = "Noto Sans",
    ),
    val typographyHeading2xLarge: Typography = Typography(
        lineHeight = 26.0,
        letterSpacing = -0.017,
        fontWeight = 700.0,
        fontSize = 20.0,
        fontFamily = "Noto Sans",
    ),
    val typographyHeading3xLarge: Typography = Typography(
        lineHeight = 32.0,
        letterSpacing = -0.019,
        fontWeight = 700.0,
        fontSize = 24.0,
        fontFamily = "Noto Sans",
    ),
    val typographyHeading4xLarge: Typography = Typography(
        lineHeight = 38.0,
        letterSpacing = -0.021,
        fontWeight = 700.0,
        fontSize = 28.0,
        fontFamily = "Noto Sans",
    ),
    val typographyHeading5xLarge: Typography = Typography(
        lineHeight = 42.0,
        letterSpacing = -0.022,
        fontWeight = 700.0,
        fontSize = 32.0,
        fontFamily = "Noto Sans",
    ),
    val typographyHeading6xLarge: Typography = Typography(
        lineHeight = 48.0,
        letterSpacing = -0.022,
        fontWeight = 700.0,
        fontSize = 36.0,
        fontFamily = "Noto Sans",
    ),
    val typographyHeading7xLarge: Typography = Typography(
        lineHeight = 56.0,
        letterSpacing = -0.022,
        fontWeight = 700.0,
        fontSize = 42.0,
        fontFamily = "Noto Sans",
    ),
    val typographyHeading8xLarge: Typography = Typography(
        lineHeight = 58.0,
        letterSpacing = -0.022,
        fontWeight = 700.0,
        fontSize = 48.0,
        fontFamily = "Noto Sans",
    ),
    val typographyHeading9xLarge: Typography = Typography(
        lineHeight = 66.0,
        letterSpacing = -0.022,
        fontWeight = 700.0,
        fontSize = 54.0,
        fontFamily = "Noto Sans",
    ),
)

data class DisplayValuesContainer1(
    val typographyDisplaySmall: Typography = Typography(
        lineHeight = 66.0,
        letterSpacing = -0.022,
        fontWeight = 700.0,
        fontSize = 54.0,
        fontFamily = "Noto Sans",
    ),
    val typographyDisplayMedium: Typography = Typography(
        lineHeight = 72.0,
        letterSpacing = -0.022,
        fontWeight = 700.0,
        fontSize = 60.0,
        fontFamily = "Noto Sans",
    ),
    val typographyDisplayLarge: Typography = Typography(
        lineHeight = 82.0,
        letterSpacing = -0.022,
        fontWeight = 700.0,
        fontSize = 68.0,
        fontFamily = "Noto Sans",
    ),
    val typographyDisplayXLarge: Typography = Typography(
        lineHeight = 92.0,
        letterSpacing = -0.022,
        fontWeight = 700.0,
        fontSize = 76.0,
        fontFamily = "Noto Sans",
    ),
    val typographyDisplay2xLarge: Typography = Typography(
        lineHeight = 102.0,
        letterSpacing = -0.022,
        fontWeight = 700.0,
        fontSize = 84.0,
        fontFamily = "Noto Sans",
    ),
    val typographyDisplay3xLarge: Typography = Typography(
        lineHeight = 112.0,
        letterSpacing = -0.022,
        fontWeight = 700.0,
        fontSize = 92.0,
        fontFamily = "Noto Sans",
    ),
)

data class TypographyValuesContainer1(
    val code: CodeValuesContainer1 = CodeValuesContainer1(),
    val utility: UtilityValuesContainer1 = UtilityValuesContainer1(),
    val body: BodyValuesContainer1 = BodyValuesContainer1(),
    val heading: HeadingValuesContainer1 = HeadingValuesContainer1(),
    val display: DisplayValuesContainer1 = DisplayValuesContainer1(),
)

data class DimensionValuesContainer1(
    val dimension0: Double = 0.0,
    val dimension25: Double = 2.0,
    val dimension50: Double = 4.0,
    val dimension100: Double = 8.0,
    val dimension150: Double = 12.0,
    val dimension200: Double = 16.0,
    val dimension250: Double = 20.0,
    val dimension300: Double = 24.0,
    val dimension400: Double = 32.0,
    val dimension500: Double = 40.0,
    val dimension550: Double = 44.0,
    val dimension600: Double = 48.0,
    val dimension700: Double = 56.0,
    val dimension800: Double = 64.0,
    val dimension900: Double = 72.0,
    val dimension1000: Double = 80.0,
    val dimension1200: Double = 96.0,
    val dimension1500: Double = 120.0,
    val dimension1600: Double = 128.0,
)

data class BottomValuesContainer1(
    val elevationBottom100: BoxShadow = BoxShadow(
        y = 1.0,
        x = 0.0,
        type = "dropShadow",
        spread = 0.0,
        color = "#1b242c1f",
        blur = 2.0,
    ),
    val elevationBottom200: List<BoxShadow> = listOf(
        BoxShadow(
            y = 2.0,
            x = 0.0,
            type = "dropShadow",
            spread = -1.0,
            color = "#1b242c0a",
            blur = 2.0,
        ),
        BoxShadow(
            y = 2.0,
            x = 0.0,
            type = "dropShadow",
            spread = -1.0,
            color = "#1b242c14",
            blur = 8.0,
        ),
    ),
    val elevationBottom300: List<BoxShadow> = listOf(
        BoxShadow(
            y = 2.0,
            x = 0.0,
            type = "dropShadow",
            spread = -1.0,
            color = "#1b242c0a",
            blur = 2.0,
        ),
        BoxShadow(
            y = 8.0,
            x = 0.0,
            type = "dropShadow",
            spread = -2.0,
            color = "#1b242c1f",
            blur = 16.0,
        ),
    ),
    val elevationBottom400: List<BoxShadow> = listOf(
        BoxShadow(
            y = 2.0,
            x = 0.0,
            type = "dropShadow",
            spread = -1.0,
            color = "#1b242c0a",
            blur = 2.0,
        ),
        BoxShadow(
            y = 16.0,
            x = 0.0,
            type = "dropShadow",
            spread = -6.0,
            color = "#1b242c29",
            blur = 24.0,
        ),
    ),
)

data class TopValuesContainer1(
    val elevationTop100: BoxShadow = BoxShadow(
        y = -1.0,
        x = 0.0,
        type = "dropShadow",
        spread = 0.0,
        color = "#1b242c1f",
        blur = 2.0,
    ),
    val elevationTop200: List<BoxShadow> = listOf(
        BoxShadow(
            y = -2.0,
            x = 0.0,
            type = "dropShadow",
            spread = -1.0,
            color = "#1b242c0a",
            blur = 2.0,
        ),
        BoxShadow(
            y = -2.0,
            x = 0.0,
            type = "dropShadow",
            spread = -1.0,
            color = "#1b242c14",
            blur = 8.0,
        ),
    ),
    val elevationTop300: List<BoxShadow> = listOf(
        BoxShadow(
            y = -2.0,
            x = 0.0,
            type = "dropShadow",
            spread = -1.0,
            color = "#1b242c0a",
            blur = 2.0,
        ),
        BoxShadow(
            y = -8.0,
            x = 0.0,
            type = "dropShadow",
            spread = -2.0,
            color = "#1b242c1f",
            blur = 16.0,
        ),
    ),
    val elevationTop400: List<BoxShadow> = listOf(
        BoxShadow(
            y = -2.0,
            x = 0.0,
            type = "dropShadow",
            spread = -1.0,
            color = "#1b242c0a",
            blur = 2.0,
        ),
        BoxShadow(
            y = -16.0,
            x = 0.0,
            type = "dropShadow",
            spread = -6.0,
            color = "#1b242c29",
            blur = 24.0,
        ),
    ),
)

data class ElevationValuesContainer1(
    val bottom: BottomValuesContainer1 = BottomValuesContainer1(),
    val top: TopValuesContainer1 = TopValuesContainer1(),
)

data class FontFamilyValuesContainer1(
    val sans: String = "Noto Sans",
    val serif: String = "Noto Serif",
    val mono: String = "Noto Sans Mono",
)

data class FontSizeValuesContainer1(
    val fontSize100: Double = 8.0,
    val fontSize125: Double = 10.0,
    val fontSize150: Double = 12.0,
    val fontSize175: Double = 14.0,
    val fontSize200: Double = 16.0,
    val fontSize225: Double = 18.0,
    val fontSize250: Double = 20.0,
    val fontSize300: Double = 24.0,
    val fontSize350: Double = 28.0,
    val fontSize400: Double = 32.0,
    val fontSize450: Double = 36.0,
    val fontSize525: Double = 42.0,
    val fontSize600: Double = 48.0,
    val fontSize675: Double = 54.0,
    val fontSize750: Double = 60.0,
    val fontSize850: Double = 68.0,
    val fontSize950: Double = 76.0,
    val fontSize1050: Double = 84.0,
    val fontSize1150: Double = 92.0,
)

data class FontWeightValuesContainer1(
    val fontWeight300: Double = 300.0,
    val fontWeight400: Double = 400.0,
    val fontWeight500: Double = 500.0,
    val fontWeight600: Double = 600.0,
    val fontWeight700: Double = 700.0,
)

data class LetterSpacingValuesContainer1(
    val letterSpacing0: Double = 0.0,
    val letterSpacing100: Double = -0.006,
    val letterSpacing200: Double = -0.011,
    val letterSpacing300: Double = -0.014,
    val letterSpacing400: Double = -0.017,
    val letterSpacing500: Double = -0.019,
    val letterSpacing600: Double = -0.021,
    val letterSpacing700: Double = -0.022,
)

data class LineHeightValuesContainer1(
    val value150: Double = 12.0,
    val value200: Double = 16.0,
    val value250: Double = 20.0,
    val value275: Double = 22.0,
    val value300: Double = 24.0,
    val value325: Double = 26.0,
    val value400: Double = 32.0,
    val value475: Double = 38.0,
    val value525: Double = 42.0,
    val value600: Double = 48.0,
    val value700: Double = 56.0,
    val value725: Double = 58.0,
    val value825: Double = 66.0,
    val value900: Double = 72.0,
    val value1025: Double = 82.0,
    val value1150: Double = 92.0,
    val value1275: Double = 102.0,
    val value1400: Double = 112.0,
)

data class Typography(
    val lineHeight: Double,
    val letterSpacing: Double,
    val fontWeight: Double,
    val fontSize: Double,
    val fontFamily: String,
)

data class BoxShadow(
    val y: Double,
    val x: Double,
    val type: String,
    val spread: Double,
    val color: String,
    val blur: Double,
)
