package com.b_labs.mylo.tokens
data class BorderWidthValuesContainer(
    val focus: Double = 2.0,
    val none: Double = 0.0,
    val small: Double = 1.0,
    val medium: Double = 2.0,
    val large: Double = 4.0,
    val xLarge: Double = 8.0,
    val borderWidth0: Double = 0.0,
    val borderWidth100: Double = 1.0,
    val borderWidth200: Double = 2.0,
    val borderWidth400: Double = 4.0,
    val borderWidth800: Double = 8.0,
)

data class BorderRadiusValuesContainer(
    val none: Double = 0.0,
    val small: Double = 2.0,
    val medium: Double = 4.0,
    val large: Double = 8.0,
    val xLarge: Double = 12.0,
    val borderRadius2xLarge: Double = 16.0,
    val borderRadius3xLarge: Double = 20.0,
    val borderRadius4xLarge: Double = 24.0,
    val full: Double = 999.0,
    val borderRadius0: Double = 0.0,
    val borderRadius25: Double = 2.0,
    val borderRadius50: Double = 4.0,
    val borderRadius100: Double = 8.0,
    val borderRadius150: Double = 12.0,
    val borderRadius200: Double = 16.0,
    val borderRadius250: Double = 20.0,
    val borderRadius300: Double = 24.0,
    val borderRadius999: Double = 999.0,
)

data class SizeValuesContainer(
    val size3xLarge: Double = 72.0,
    val size2xLarge: Double = 64.0,
    val xLarge: Double = 56.0,
    val large: Double = 48.0,
    val medium: Double = 40.0,
    val small: Double = 32.0,
    val xSmall: Double = 24.0,
    val size2xSmall: Double = 20.0,
    val size3xSmall: Double = 16.0,
)

data class PaddingValuesContainer(
    val none: Double = 0.0,
    val padding2xSmall: Double = 2.0,
    val xSmall: Double = 4.0,
    val small: Double = 8.0,
    val medium: Double = 12.0,
    val large: Double = 16.0,
    val padding2xLarge: Double = 24.0,
    val padding3xLarge: Double = 32.0,
    val padding4xLarge: Double = 40.0,
    val padding5xLarge: Double = 44.0,
    val padding6xLarge: Double = 64.0,
)

data class GapValuesContainer(
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

data class SpaceValuesContainer(
    val padding: PaddingValuesContainer = PaddingValuesContainer(),
    val gap: GapValuesContainer = GapValuesContainer(),
)

data class OpacityValuesContainer(
    val disabled: Double = 0.5,
    val opacity0: Double = 0.0,
    val opacity50: Double = 0.5,
    val opacity100: Double = 1.0,
)

data class CodeValuesContainer(
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

data class UtilityValuesContainer(
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

data class BodyValuesContainer(
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

data class HeadingValuesContainer(
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

data class DisplayValuesContainer(
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

data class TypographyValuesContainer(
    val code: CodeValuesContainer = CodeValuesContainer(),
    val utility: UtilityValuesContainer = UtilityValuesContainer(),
    val body: BodyValuesContainer = BodyValuesContainer(),
    val heading: HeadingValuesContainer = HeadingValuesContainer(),
    val display: DisplayValuesContainer = DisplayValuesContainer(),
)

data class DimensionValuesContainer(
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