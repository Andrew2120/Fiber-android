package com.b_labs.token

import android.graphics.Color.parseColor
import androidx.compose.ui.graphics.Color

data class BottomValuesContainer(
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

data class TopValuesContainer(
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

data class ElevationValuesContainer(
    val bottom: BottomValuesContainer = BottomValuesContainer(),
    val top: TopValuesContainer = TopValuesContainer(),
)

data class FontFamilyValuesContainer(
    val sans: String = "Noto Sans",
    val serif: String = "Noto Serif",
    val mono: String = "Noto Sans Mono",
)

data class FontSizeValuesContainer(
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

data class FontWeightValuesContainer(
    val fontWeight300: Double = 300.0,
    val fontWeight400: Double = 400.0,
    val fontWeight500: Double = 500.0,
    val fontWeight600: Double = 600.0,
    val fontWeight700: Double = 700.0,
)

data class LetterSpacingValuesContainer(
    val letterSpacing0: Double = 0.0,
    val letterSpacing100: Double = -0.006,
    val letterSpacing200: Double = -0.011,
    val letterSpacing300: Double = -0.014,
    val letterSpacing400: Double = -0.017,
    val letterSpacing500: Double = -0.019,
    val letterSpacing600: Double = -0.021,
    val letterSpacing700: Double = -0.022,
)

data class LineHeightValuesContainer(
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

val x = ContentValuesContainer1(
    primary = Color(parseColor("#272e35")),
    secondary = Color(parseColor("#555f6d")),
    tertiary = Color(parseColor("#7e8c9a")),
    disabled = Color(parseColor("#9ea8b3")),
    primaryInverse = Color(parseColor("#ffffff")),
    secondaryInverse = Color(parseColor("#ffffffa3")),
    tertiaryInverse = Color(parseColor("#ffffff66")),
    disabledInverse = Color(parseColor("#ffffff3d")),
    infoPrimary = Color(parseColor("#113997")),
    infoSecondary = Color(parseColor("#3061d5")),
    successPrimary = Color(parseColor("#135315")),
    successSecondary = Color(parseColor("#347434")),
    warningPrimary = Color(parseColor("#7a4510")),
    warningSecondary = Color(parseColor("#f59638")),
    dangerPrimary = Color(parseColor("#6f2020")),
    dangerSecondary = Color(parseColor("#c53434")),
    brandPrimary = Color(parseColor("#113997")),
    brandSecondary = Color(parseColor("#3061d5")),
)

data class ContentValuesContainer1(
    val primary: Color = Color(parseColor("#272e35")),
    val secondary: Color = Color(parseColor("#555f6d")),
    val tertiary: Color = Color(parseColor("#7e8c9a")),
    val disabled: Color = Color(parseColor("#9ea8b3")),
    val primaryInverse: Color = Color(parseColor("#ffffff")),
    val secondaryInverse: Color = Color(parseColor("#ffffffa3")),
    val tertiaryInverse: Color = Color(parseColor("#ffffff66")),
    val disabledInverse: Color = Color(parseColor("#ffffff3d")),
    val infoPrimary: Color = Color(parseColor("#113997")),
    val infoSecondary: Color = Color(parseColor("#3061d5")),
    val successPrimary: Color = Color(parseColor("#135315")),
    val successSecondary: Color = Color(parseColor("#347434")),
    val warningPrimary: Color = Color(parseColor("#7a4510")),
    val warningSecondary: Color = Color(parseColor("#f59638")),
    val dangerPrimary: Color = Color(parseColor("#6f2020")),
    val dangerSecondary: Color = Color(parseColor("#c53434")),
    val brandPrimary: Color = Color(parseColor("#113997")),
    val brandSecondary: Color = Color(parseColor("#3061d5")),
)

data class BorderValuesContainer2(
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

data class BackgroundValuesContainer2(
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

data class PrimaryValuesContainer1(
    val actionPrimaryNormal: Color = Color(parseColor("#3061d5")),
    val actionPrimaryHover: Color = Color(parseColor("#1e4fc2")),
    val actionPrimaryActive: Color = Color(parseColor("#113997")),
    val actionPrimarySelected: Color = Color(parseColor("#1e4fc2")),
    val actionPrimarySubtleNormal: Color = Color(parseColor("#ebf0ff")),
    val actionPrimarySubtleHover: Color = Color(parseColor("#e5eeff")),
    val actionPrimarySubtleActive: Color = Color(parseColor("#ccdcff")),
    val actionPrimarySubtleSelected: Color = Color(parseColor("#e5eeff")),
)

data class NeutralValuesContainer3(
    val actionNeutralNormal: Color = Color(parseColor("#4a545e")),
    val actionNeutralHover: Color = Color(parseColor("#3a424a")),
    val actionNeutralActive: Color = Color(parseColor("#272e35")),
    val actionNeutralSelected: Color = Color(parseColor("#3a424a")),
    val actionNeutralSubtleNormal: Color = Color(parseColor("#f0f3f5")),
    val actionNeutralSubtleHover: Color = Color(parseColor("#eaedf0")),
    val actionNeutralSubtleActive: Color = Color(parseColor("#cfd6dd")),
    val actionNeutralSubtleSelected: Color = Color(parseColor("#eaedf0")),
)

data class SuccessValuesContainer2(
    val actionSuccessNormal: Color = Color(parseColor("#347434")),
    val actionSuccessHover: Color = Color(parseColor("#246626")),
    val actionSuccessActive: Color = Color(parseColor("#135315")),
    val actionSuccessSelected: Color = Color(parseColor("#246626")),
    val actionSuccessSubtleNormal: Color = Color(parseColor("#e6f9e6")),
    val actionSuccessSubtleHover: Color = Color(parseColor("#dff6df")),
    val actionSuccessSubtleActive: Color = Color(parseColor("#c6ecc6")),
    val actionSuccessSubtleSelected: Color = Color(parseColor("#dff6df")),
)

data class DangerValuesContainer3(
    val actionDangerNormal: Color = Color(parseColor("#c53434")),
    val actionDangerHover: Color = Color(parseColor("#952d2d")),
    val actionDangerActive: Color = Color(parseColor("#6f2020")),
    val actionDangerSelected: Color = Color(parseColor("#952d2d")),
    val actionDangerSubtleNormal: Color = Color(parseColor("#ffebeb")),
    val actionDangerSubtleHover: Color = Color(parseColor("#fee7e7")),
    val actionDangerSubtleActive: Color = Color(parseColor("#fccfcf")),
    val actionDangerSubtleSelected: Color = Color(parseColor("#fee7e7")),
)

data class GhostValuesContainer2(
    val actionGhostNormal: Color = Color(parseColor("#ffffff00")),
    val actionGhostHover: Color = Color(parseColor("#022e500f")),
    val actionGhostActive: Color = Color(parseColor("#10284717")),
    val actionGhostSelected: Color = Color(parseColor("#022e500f")),
    val actionGhostInverseHover: Color = Color(parseColor("#ffffff1a")),
    val actionGhostInverseActive: Color = Color(parseColor("#ffffff1f")),
    val actionGhostInverseSelected: Color = Color(parseColor("#ffffff1a")),
    val actionGhostDangerHover: Color = Color(parseColor("#ffebeb")),
    val actionGhostDangerActive: Color = Color(parseColor("#fee7e7")),
    val actionGhostDangerSelected: Color = Color(parseColor("#ffebeb")),
)

data class OutlineValuesContainer1(
    val actionOutlineNormal: Color = Color(parseColor("#cfd6dd")),
    val actionOutlineHover: Color = Color(parseColor("#9ea8b3")),
    val actionOutlineActive: Color = Color(parseColor("#7e8c9a")),
    val actionOutlineSelected: Color = Color(parseColor("#9ea8b3")),
)

data class InverseValuesContainer2(
    val actionInverseNormal: Color = Color(parseColor("#ffffff")),
    val actionInverseHover: Color = Color(parseColor("#ffffffd1")),
    val actionInverseActive: Color = Color(parseColor("#ffffffb8")),
    val actionInverseSelected: Color = Color(parseColor("#ffffffd1")),
)

data class ReverseInverseValuesContainer1(
    val actionReverseInverseNormal: Color = Color(parseColor("#0a121ae0")),
    val actionReverseInverseHover: Color = Color(parseColor("#1d2835cc")),
    val actionReverseInverseActive: Color = Color(parseColor("#182639bd")),
    val actionReverseInverseSelected: Color = Color(parseColor("#1d2835cc")),
)

data class ActionValuesContainer1(
    val primary: PrimaryValuesContainer1 = PrimaryValuesContainer1(),
    val neutral: NeutralValuesContainer3 = NeutralValuesContainer3(),
    val success: SuccessValuesContainer2 = SuccessValuesContainer2(),
    val danger: DangerValuesContainer3 = DangerValuesContainer3(),
    val ghost: GhostValuesContainer2 = GhostValuesContainer2(),
    val outline: OutlineValuesContainer1 = OutlineValuesContainer1(),
    val inverse: InverseValuesContainer2 = InverseValuesContainer2(),
    val reverseInverse: ReverseInverseValuesContainer1 = ReverseInverseValuesContainer1(),
)

data class DefaultValuesContainer1(
    val interactionDefaultNormal: Color = Color(parseColor("#3061d5")),
    val interactionDefaultHover: Color = Color(parseColor("#1e4fc2")),
    val interactionDefaultActive: Color = Color(parseColor("#113997")),
    val interactionDefaultSelected: Color = Color(parseColor("#1e4fc2")),
    val interactionDefaultSubtleNormal: Color = Color(parseColor("#ebf0ff")),
    val interactionDefaultSubtleHover: Color = Color(parseColor("#e5eeff")),
    val interactionDefaultSubtleActive: Color = Color(parseColor("#ccdcff")),
    val interactionDefaultSubtleSelected: Color = Color(parseColor("#e5eeff")),
)

data class NeutralValuesContainer4(
    val interactionNeutralNormal: Color = Color(parseColor("#4a545e")),
    val interactionNeutralHover: Color = Color(parseColor("#3a424a")),
    val interactionNeutralActive: Color = Color(parseColor("#272e35")),
    val interactionNeutralSelected: Color = Color(parseColor("#3a424a")),
    val interactionNeutralSubtleNormal: Color = Color(parseColor("#f0f3f5")),
    val interactionNeutralSubtleHover: Color = Color(parseColor("#eaedf0")),
    val interactionNeutralSubtleActive: Color = Color(parseColor("#cfd6dd")),
    val interactionNeutralSubtleSelected: Color = Color(parseColor("#eaedf0")),
)

data class DangerValuesContainer4(
    val interactionDangerNormal: Color = Color(parseColor("#c53434")),
    val interactionDangerHover: Color = Color(parseColor("#952d2d")),
    val interactionDangerActive: Color = Color(parseColor("#6f2020")),
    val interactionDangerSelected: Color = Color(parseColor("#952d2d")),
    val interactionDangerSubtleNormal: Color = Color(parseColor("#ffebeb")),
    val interactionDangerSubtleHover: Color = Color(parseColor("#fee7e7")),
    val interactionDangerSubtleActive: Color = Color(parseColor("#fccfcf")),
    val interactionDangerSubtleSelected: Color = Color(parseColor("#fee7e7")),
)

data class GhostValuesContainer3(
    val interactionGhostNormal: Color = Color(parseColor("#ffffff00")),
    val interactionGhostHover: Color = Color(parseColor("#022e500f")),
    val interactionGhostActive: Color = Color(parseColor("#10284717")),
    val interactionGhostSelected: Color = Color(parseColor("#022e500f")),
    val interactionGhostInverseHover: Color = Color(parseColor("#ffffff1a")),
    val interactionGhostInverseNormal: Color = Color(parseColor("#ffffff1f")),
    val interactionGhostInverseSelected: Color = Color(parseColor("#ffffff1a")),
    val interactionGhostDangerHover: Color = Color(parseColor("#ffebeb")),
    val interactionGhostDangerNormal: Color = Color(parseColor("#fee7e7")),
    val interactionGhostDangerSelected: Color = Color(parseColor("#ffebeb")),
)

data class DisabledValuesContainer1(
    val interactionDisabledNormal: Color = Color(parseColor("#9ea8b3")),
    val interactionDisabledHover: Color = Color(parseColor("#7e8c9a")),
    val interactionDisabledActive: Color = Color(parseColor("#555f6d")),
    val interactionDisabledSubtleNormal: Color = Color(parseColor("#eaedf0")),
    val interactionDisabledSubtleHover: Color = Color(parseColor("#dee3e7")),
    val interactionDisabledSubtleActive: Color = Color(parseColor("#cfd6dd")),
)

data class BorderValuesContainer3(
    val interactionBorderNormal: Color = Color(parseColor("#8eb0fb")),
    val interactionBorderHover: Color = Color(parseColor("#6691f4")),
    val interactionBorderActive: Color = Color(parseColor("#2759ce")),
    val interactionBorderSelected: Color = Color(parseColor("#3061d5")),
    val interactionBorderNeutralNormal: Color = Color(parseColor("#cfd6dd")),
    val interactionBorderNeutralHover: Color = Color(parseColor("#9ea8b3")),
    val interactionBorderNeutralActive: Color = Color(parseColor("#7e8c9a")),
    val interactionBorderNeutralSelected: Color = Color(parseColor("#9ea8b3")),
    val interactionBorderDanger: Color = Color(parseColor("#f26363")),
)

data class BackgroundValuesContainer3(
    val interactionBackgroundModal: Color = Color(parseColor("#ffffff")),
    val interactionBackgroundModeless: Color = Color(parseColor("#ffffff")),
    val interactionBackgroundModelessInverse: Color = Color(parseColor("#272e35")),
    val interactionBackgroundSidepanel: Color = Color(parseColor("#ffffff")),
    val interactionBackgroundFormField: Color = Color(parseColor("#ffffff")),
    val interactionBackgroundDimmer: Color = Color(parseColor("#182639bd")),
)

data class InverseValuesContainer3(
    val interactionInverseNormal: Color = Color(parseColor("#ffffff")),
    val interactionInverseHover: Color = Color(parseColor("#ffffffd1")),
    val interactionInverseActive: Color = Color(parseColor("#ffffffb8")),
    val interactionInverseSelected: Color = Color(parseColor("#ffffffd1")),
)

data class FocusValuesContainer1(
    val interactionFocusDefault: Color = Color(parseColor("#6691f4")),
)

data class InteractionValuesContainer1(
    val default: DefaultValuesContainer1 = DefaultValuesContainer1(),
    val neutral: NeutralValuesContainer4 = NeutralValuesContainer4(),
    val danger: DangerValuesContainer4 = DangerValuesContainer4(),
    val ghost: GhostValuesContainer3 = GhostValuesContainer3(),
    val disabled: DisabledValuesContainer1 = DisabledValuesContainer1(),
    val border: BorderValuesContainer3 = BorderValuesContainer3(),
    val background: BackgroundValuesContainer3 = BackgroundValuesContainer3(),
    val inverse: InverseValuesContainer3 = InverseValuesContainer3(),
    val focus: FocusValuesContainer1 = FocusValuesContainer1(),
)
