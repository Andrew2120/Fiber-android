package com.b_labs.token

import android.graphics.Color.parseColor
import androidx.compose.ui.graphics.Color

data class FocusValuesContainer(
    val interactionFocusDefault: Color = Color(parseColor("#6691f4")),
)

data class InteractionValuesContainer(
    val default: DefaultValuesContainer = DefaultValuesContainer(),
    val neutral: NeutralValuesContainer1 = NeutralValuesContainer1(),
    val danger: DangerValuesContainer1 = DangerValuesContainer1(),
    val ghost: GhostValuesContainer1 = GhostValuesContainer1(),
    val disabled: DisabledValuesContainer = DisabledValuesContainer(),
    val border: BorderValuesContainer1 = BorderValuesContainer1(),
    val background: BackgroundValuesContainer1 = BackgroundValuesContainer1(),
    val inverse: InverseValuesContainer1 = InverseValuesContainer1(),
    val focus: FocusValuesContainer = FocusValuesContainer(),
)

data class GrayValuesContainer(
    val nonSemanticGrayContentPrimary: Color = Color(parseColor("#272e35")),
    val nonSemanticGrayContentSecondary: Color = Color(parseColor("#555f6d")),
    val nonSemanticGrayBorderDefault: Color = Color(parseColor("#eaedf0")),
    val nonSemanticGrayBorderStrong: Color = Color(parseColor("#555f6d")),
    val nonSemanticGrayBorderSubtle: Color = Color(parseColor("#cfd6dd")),
    val nonSemanticGrayBackgroundStrong: Color = Color(parseColor("#555f6d")),
    val nonSemanticGrayBackgroundMuted: Color = Color(parseColor("#dee3e7")),
    val nonSemanticGrayBackgroundOnSubtle: Color = Color(parseColor("#eaedf0")),
    val nonSemanticGrayBackgroundSubtle: Color = Color(parseColor("#f5f7f9")),
    val nonSemanticGrayBackgroundSurface: Color = Color(parseColor("#fcfcfd")),
)

data class WhiteValuesContainer(
    val nonSemanticWhiteContentPrimary: Color = Color(parseColor("#ffffff")),
    val nonSemanticWhiteContentSecondary: Color = Color(parseColor("#ffffffa3")),
    val nonSemanticWhiteBorderDefault: Color = Color(parseColor("#ffffff66")),
    val nonSemanticWhiteBorderStrong: Color = Color(parseColor("#ffffff")),
    val nonSemanticWhiteBorderSubtle: Color = Color(parseColor("#ffffffad")),
    val nonSemanticWhiteBackgroundStrong: Color = Color(parseColor("#ffffff")),
    val nonSemanticWhiteBackgroundMuted: Color = Color(parseColor("#ffffffa3")),
    val nonSemanticWhiteBackgroundOnSubtle: Color = Color(parseColor("#ffffff66")),
    val nonSemanticWhiteBackgroundSubtle: Color = Color(parseColor("#ffffff1f")),
    val nonSemanticWhiteBackgroundSurface: Color = Color(parseColor("#ffffff1a")),
)

data class RedValuesContainer(
    val nonSemanticRedContentPrimary: Color = Color(parseColor("#6f2020")),
    val nonSemanticRedContentSecondary: Color = Color(parseColor("#c53434")),
    val nonSemanticRedBorderDefault: Color = Color(parseColor("#fee7e7")),
    val nonSemanticRedBorderStrong: Color = Color(parseColor("#c53434")),
    val nonSemanticRedBorderSubtle: Color = Color(parseColor("#fccfcf")),
    val nonSemanticRedBackgroundStrong: Color = Color(parseColor("#c53434")),
    val nonSemanticRedBackgroundMuted: Color = Color(parseColor("#fcd9d9")),
    val nonSemanticRedBackgroundOnSubtle: Color = Color(parseColor("#fee7e7")),
    val nonSemanticRedBackgroundSubtle: Color = Color(parseColor("#fef5f5")),
    val nonSemanticRedBackgroundSurface: Color = Color(parseColor("#fffafa")),
)

data class MagentaValuesContainer(
    val nonSemanticMagentaContentPrimary: Color = Color(parseColor("#671e4d")),
    val nonSemanticMagentaContentSecondary: Color = Color(parseColor("#b12f86")),
    val nonSemanticMagentaBorderDefault: Color = Color(parseColor("#fde2f4")),
    val nonSemanticMagentaBorderStrong: Color = Color(parseColor("#b12f86")),
    val nonSemanticMagentaBorderSubtle: Color = Color(parseColor("#f7cae8")),
    val nonSemanticMagentaBackgroundStrong: Color = Color(parseColor("#b12f86")),
    val nonSemanticMagentaBackgroundMuted: Color = Color(parseColor("#fbd5ee")),
    val nonSemanticMagentaBackgroundOnSubtle: Color = Color(parseColor("#fde2f4")),
    val nonSemanticMagentaBackgroundSubtle: Color = Color(parseColor("#fef6fb")),
    val nonSemanticMagentaBackgroundSurface: Color = Color(parseColor("#fffafd")),
)

data class PurpleValuesContainer(
    val nonSemanticPurpleContentPrimary: Color = Color(parseColor("#5b1e67")),
    val nonSemanticPurpleContentSecondary: Color = Color(parseColor("#9939ac")),
    val nonSemanticPurpleBorderDefault: Color = Color(parseColor("#f8e2fd")),
    val nonSemanticPurpleBorderStrong: Color = Color(parseColor("#9939ac")),
    val nonSemanticPurpleBorderSubtle: Color = Color(parseColor("#f4caf7")),
    val nonSemanticPurpleBackgroundStrong: Color = Color(parseColor("#9939ac")),
    val nonSemanticPurpleBackgroundMuted: Color = Color(parseColor("#f5d5fb")),
    val nonSemanticPurpleBackgroundOnSubtle: Color = Color(parseColor("#f8e2fd")),
    val nonSemanticPurpleBackgroundSubtle: Color = Color(parseColor("#fdf5ff")),
    val nonSemanticPurpleBackgroundSurface: Color = Color(parseColor("#fefaff")),
)

data class VioletValuesContainer(
    val nonSemanticVioletContentPrimary: Color = Color(parseColor("#39288a")),
    val nonSemanticVioletContentSecondary: Color = Color(parseColor("#634eca")),
    val nonSemanticVioletBorderDefault: Color = Color(parseColor("#eeebff")),
    val nonSemanticVioletBorderStrong: Color = Color(parseColor("#634eca")),
    val nonSemanticVioletBorderSubtle: Color = Color(parseColor("#dcd6ff")),
    val nonSemanticVioletBackgroundStrong: Color = Color(parseColor("#634eca")),
    val nonSemanticVioletBackgroundMuted: Color = Color(parseColor("#e3e0ff")),
    val nonSemanticVioletBackgroundOnSubtle: Color = Color(parseColor("#eeebff")),
    val nonSemanticVioletBackgroundSubtle: Color = Color(parseColor("#f7f5ff")),
    val nonSemanticVioletBackgroundSurface: Color = Color(parseColor("#fbfaff")),
)

data class BlueValuesContainer(
    val nonSemanticBlueContentPrimary: Color = Color(parseColor("#113997")),
    val nonSemanticBlueContentSecondary: Color = Color(parseColor("#3061d5")),
    val nonSemanticBlueBorderDefault: Color = Color(parseColor("#e5eeff")),
    val nonSemanticBlueBorderStrong: Color = Color(parseColor("#3061d5")),
    val nonSemanticBlueBorderSubtle: Color = Color(parseColor("#ccdcff")),
    val nonSemanticBlueBackgroundStrong: Color = Color(parseColor("#3061d5")),
    val nonSemanticBlueBackgroundMuted: Color = Color(parseColor("#d6e3ff")),
    val nonSemanticBlueBackgroundOnSubtle: Color = Color(parseColor("#e5eeff")),
    val nonSemanticBlueBackgroundSubtle: Color = Color(parseColor("#f5f8ff")),
    val nonSemanticBlueBackgroundSurface: Color = Color(parseColor("#fafbff")),
)

data class CyanValuesContainer(
    val nonSemanticCyanContentPrimary: Color = Color(parseColor("#0c456e")),
    val nonSemanticCyanContentSecondary: Color = Color(parseColor("#0870ba")),
    val nonSemanticCyanBorderDefault: Color = Color(parseColor("#e0f1ff")),
    val nonSemanticCyanBorderStrong: Color = Color(parseColor("#0870ba")),
    val nonSemanticCyanBorderSubtle: Color = Color(parseColor("#c2e2ff")),
    val nonSemanticCyanBackgroundStrong: Color = Color(parseColor("#0870ba")),
    val nonSemanticCyanBackgroundMuted: Color = Color(parseColor("#cce7ff")),
    val nonSemanticCyanBackgroundOnSubtle: Color = Color(parseColor("#e0f1ff")),
    val nonSemanticCyanBackgroundSubtle: Color = Color(parseColor("#f0f9ff")),
    val nonSemanticCyanBackgroundSurface: Color = Color(parseColor("#fafdff")),
)

data class TealValuesContainer(
    val nonSemanticTealContentPrimary: Color = Color(parseColor("#0a495c")),
    val nonSemanticTealContentSecondary: Color = Color(parseColor("#077597")),
    val nonSemanticTealBorderDefault: Color = Color(parseColor("#e0f3fa")),
    val nonSemanticTealBorderStrong: Color = Color(parseColor("#077597")),
    val nonSemanticTealBorderSubtle: Color = Color(parseColor("#b8e8f5")),
    val nonSemanticTealBackgroundStrong: Color = Color(parseColor("#077597")),
    val nonSemanticTealBackgroundMuted: Color = Color(parseColor("#c5ecf7")),
    val nonSemanticTealBackgroundOnSubtle: Color = Color(parseColor("#e0f3fa")),
    val nonSemanticTealBackgroundSubtle: Color = Color(parseColor("#f0fbff")),
    val nonSemanticTealBackgroundSurface: Color = Color(parseColor("#fafeff")),
)

data class AquamarineValuesContainer(
    val nonSemanticAquamarineContentPrimary: Color = Color(parseColor("#0d4a42")),
    val nonSemanticAquamarineContentSecondary: Color = Color(parseColor("#097b68")),
    val nonSemanticAquamarineBorderDefault: Color = Color(parseColor("#daf6f3")),
    val nonSemanticAquamarineBorderStrong: Color = Color(parseColor("#097b68")),
    val nonSemanticAquamarineBorderSubtle: Color = Color(parseColor("#bee9e4")),
    val nonSemanticAquamarineBackgroundStrong: Color = Color(parseColor("#097b68")),
    val nonSemanticAquamarineBackgroundMuted: Color = Color(parseColor("#c5f2ec")),
    val nonSemanticAquamarineBackgroundOnSubtle: Color = Color(parseColor("#daf6f3")),
    val nonSemanticAquamarineBackgroundSubtle: Color = Color(parseColor("#f0faf9")),
    val nonSemanticAquamarineBackgroundSurface: Color = Color(parseColor("#fbfefe")),
)

data class GreenValuesContainer(
    val nonSemanticGreenContentPrimary: Color = Color(parseColor("#135315")),
    val nonSemanticGreenContentSecondary: Color = Color(parseColor("#347434")),
    val nonSemanticGreenBorderDefault: Color = Color(parseColor("#dff6df")),
    val nonSemanticGreenBorderStrong: Color = Color(parseColor("#347434")),
    val nonSemanticGreenBorderSubtle: Color = Color(parseColor("#c6ecc6")),
    val nonSemanticGreenBackgroundStrong: Color = Color(parseColor("#347434")),
    val nonSemanticGreenBackgroundMuted: Color = Color(parseColor("#cff2cf")),
    val nonSemanticGreenBackgroundOnSubtle: Color = Color(parseColor("#dff6df")),
    val nonSemanticGreenBackgroundSubtle: Color = Color(parseColor("#f4fbf4")),
    val nonSemanticGreenBackgroundSurface: Color = Color(parseColor("#fbfefb")),
)

data class OrangeValuesContainer(
    val nonSemanticOrangeContentPrimary: Color = Color(parseColor("#7a4510")),
    val nonSemanticOrangeContentSecondary: Color = Color(parseColor("#f59638")),
    val nonSemanticOrangeBorderDefault: Color = Color(parseColor("#ffe8d1")),
    val nonSemanticOrangeBorderStrong: Color = Color(parseColor("#f59638")),
    val nonSemanticOrangeBorderSubtle: Color = Color(parseColor("#ffd4a8")),
    val nonSemanticOrangeBackgroundStrong: Color = Color(parseColor("#f59638")),
    val nonSemanticOrangeBackgroundMuted: Color = Color(parseColor("#fcdec0")),
    val nonSemanticOrangeBackgroundOnSubtle: Color = Color(parseColor("#ffe8d1")),
    val nonSemanticOrangeBackgroundSubtle: Color = Color(parseColor("#fff5eb")),
    val nonSemanticOrangeBackgroundSurface: Color = Color(parseColor("#fffcfa")),
)

data class NonSemanticValuesContainer(
    val gray: GrayValuesContainer = GrayValuesContainer(),
    val white: WhiteValuesContainer = WhiteValuesContainer(),
    val red: RedValuesContainer = RedValuesContainer(),
    val magenta: MagentaValuesContainer = MagentaValuesContainer(),
    val purple: PurpleValuesContainer = PurpleValuesContainer(),
    val violet: VioletValuesContainer = VioletValuesContainer(),
    val blue: BlueValuesContainer = BlueValuesContainer(),
    val cyan: CyanValuesContainer = CyanValuesContainer(),
    val teal: TealValuesContainer = TealValuesContainer(),
    val aquamarine: AquamarineValuesContainer = AquamarineValuesContainer(),
    val green: GreenValuesContainer = GreenValuesContainer(),
    val orange: OrangeValuesContainer = OrangeValuesContainer(),
)

data class BrandValuesContainer(
    val semanticBrandNegative4: Color = Color(parseColor("#6691f4")),
    val semanticBrandNegative3: Color = Color(parseColor("#113997")),
    val semanticBrandNegative2: Color = Color(parseColor("#1e4fc2")),
    val semanticBrandNegative1: Color = Color(parseColor("#2759ce")),
    val semanticBrand0: Color = Color(parseColor("#3061d5")),
    val semanticBrand1: Color = Color(parseColor("#6691f4")),
    val semanticBrand2: Color = Color(parseColor("#8eb0fb")),
    val semanticBrand3: Color = Color(parseColor("#ccdcff")),
    val semanticBrand4: Color = Color(parseColor("#d6e3ff")),
    val semanticBrand5: Color = Color(parseColor("#e5eeff")),
    val semanticBrand6: Color = Color(parseColor("#ebf0ff")),
    val semanticBrand7: Color = Color(parseColor("#f5f8ff")),
    val semanticBrand8: Color = Color(parseColor("#fafbff")),
)

data class NeutralValuesContainer2(
    val semanticNeutralNegative4: Color = Color(parseColor("#1b242c")),
    val semanticNeutralNegative3: Color = Color(parseColor("#272e35")),
    val semanticNeutralNegative2: Color = Color(parseColor("#3a424a")),
    val semanticNeutralNegative1: Color = Color(parseColor("#4a545e")),
    val semanticNeutral0: Color = Color(parseColor("#555f6d")),
    val semanticNeutral1: Color = Color(parseColor("#7e8c9a")),
    val semanticNeutral2: Color = Color(parseColor("#9ea8b3")),
    val semanticNeutral3: Color = Color(parseColor("#cfd6dd")),
    val semanticNeutral4: Color = Color(parseColor("#dee3e7")),
    val semanticNeutral5: Color = Color(parseColor("#eaedf0")),
    val semanticNeutral6: Color = Color(parseColor("#f0f3f5")),
    val semanticNeutral7: Color = Color(parseColor("#f5f7f9")),
    val semanticNeutral8: Color = Color(parseColor("#fcfcfd")),
)

data class NeutralAlphaValuesContainer(
    val semanticNeutralANegative4: Color = Color(parseColor("#09131aed")),
    val semanticNeutralANegative3: Color = Color(parseColor("#0a121ae0")),
    val semanticNeutralANegative2: Color = Color(parseColor("#1a232ddb")),
    val semanticNeutralANegative1: Color = Color(parseColor("#1d2835cc")),
    val semanticNeutralA0: Color = Color(parseColor("#182639bd")),
    val semanticNeutralA1: Color = Color(parseColor("#1830498f")),
    val semanticNeutralA2: Color = Color(parseColor("#0d253f66")),
    val semanticNeutralA3: Color = Color(parseColor("#10315633")),
    val semanticNeutralA4: Color = Color(parseColor("#04294321")),
    val semanticNeutralA5: Color = Color(parseColor("#10284717")),
    val semanticNeutralA6: Color = Color(parseColor("#022e500f")),
    val semanticNeutralA7: Color = Color(parseColor("#00295c0a")),
    val semanticNeutralA8: Color = Color(parseColor("#1f529e05")),
)

data class InfoValuesContainer(
    val semanticInfoNegative4: Color = Color(parseColor("#041f5d")),
    val semanticInfoNegative3: Color = Color(parseColor("#113997")),
    val semanticInfoNegative2: Color = Color(parseColor("#1e4fc2")),
    val semanticInfoNegative1: Color = Color(parseColor("#2759ce")),
    val semanticInfo0: Color = Color(parseColor("#3061d5")),
    val semanticInfo1: Color = Color(parseColor("#6691f4")),
    val semanticInfo2: Color = Color(parseColor("#8eb0fb")),
    val semanticInfo3: Color = Color(parseColor("#ccdcff")),
    val semanticInfo4: Color = Color(parseColor("#d6e3ff")),
    val semanticInfo5: Color = Color(parseColor("#e5eeff")),
    val semanticInfo6: Color = Color(parseColor("#ebf0ff")),
    val semanticInfo7: Color = Color(parseColor("#f5f8ff")),
    val semanticInfo8: Color = Color(parseColor("#fafbff")),
)

data class SuccessValuesContainer1(
    val semanticSuccessNegative4: Color = Color(parseColor("#0a2e0b")),
    val semanticSuccessNegative3: Color = Color(parseColor("#135315")),
    val semanticSuccessNegative2: Color = Color(parseColor("#246626")),
    val semanticSuccessNegative1: Color = Color(parseColor("#2f6f2f")),
    val semanticSuccess0: Color = Color(parseColor("#347434")),
    val semanticSuccess1: Color = Color(parseColor("#55a555")),
    val semanticSuccess2: Color = Color(parseColor("#87c987")),
    val semanticSuccess3: Color = Color(parseColor("#c6ecc6")),
    val semanticSuccess4: Color = Color(parseColor("#cff2cf")),
    val semanticSuccess5: Color = Color(parseColor("#dff6df")),
    val semanticSuccess6: Color = Color(parseColor("#e6f9e6")),
    val semanticSuccess7: Color = Color(parseColor("#f4fbf4")),
    val semanticSuccess8: Color = Color(parseColor("#fbfefb")),
)

data class WarningValuesContainer(
    val semanticWarningNegative4: Color = Color(parseColor("#492909")),
    val semanticWarningNegative3: Color = Color(parseColor("#7a4510")),
    val semanticWarningNegative2: Color = Color(parseColor("#a05c1c")),
    val semanticWarningNegative1: Color = Color(parseColor("#b4610e")),
    val semanticWarning0: Color = Color(parseColor("#f59638")),
    val semanticWarning1: Color = Color(parseColor("#f6a351")),
    val semanticWarning2: Color = Color(parseColor("#feb871")),
    val semanticWarning3: Color = Color(parseColor("#ffd4a8")),
    val semanticWarning4: Color = Color(parseColor("#fcdec0")),
    val semanticWarning5: Color = Color(parseColor("#ffe8d1")),
    val semanticWarning6: Color = Color(parseColor("#fff0e0")),
    val semanticWarning7: Color = Color(parseColor("#fff5eb")),
    val semanticWarning8: Color = Color(parseColor("#fffcfa")),
)

data class DangerValuesContainer2(
    val semanticDangerNegative4: Color = Color(parseColor("#4a0d0d")),
    val semanticDangerNegative3: Color = Color(parseColor("#6f2020")),
    val semanticDangerNegative2: Color = Color(parseColor("#952d2d")),
    val semanticDangerNegative1: Color = Color(parseColor("#a13636")),
    val semanticDanger0: Color = Color(parseColor("#c53434")),
    val semanticDanger1: Color = Color(parseColor("#f26363")),
    val semanticDanger2: Color = Color(parseColor("#f49090")),
    val semanticDanger3: Color = Color(parseColor("#fccfcf")),
    val semanticDanger4: Color = Color(parseColor("#fcd9d9")),
    val semanticDanger5: Color = Color(parseColor("#fee7e7")),
    val semanticDanger6: Color = Color(parseColor("#ffebeb")),
    val semanticDanger7: Color = Color(parseColor("#fef5f5")),
    val semanticDanger8: Color = Color(parseColor("#fffafa")),
)

data class SemanticValuesContainer(
    val brand: BrandValuesContainer = BrandValuesContainer(),
    val neutral: NeutralValuesContainer2 = NeutralValuesContainer2(),
    val neutralAlpha: NeutralAlphaValuesContainer = NeutralAlphaValuesContainer(),
    val info: InfoValuesContainer = InfoValuesContainer(),
    val success: SuccessValuesContainer1 = SuccessValuesContainer1(),
    val warning: WarningValuesContainer = WarningValuesContainer(),
    val danger: DangerValuesContainer2 = DangerValuesContainer2(),
)

data class CoolGrayValuesContainer(
    val negative4: Color = Color(parseColor("#1b242c")),
    val negative3: Color = Color(parseColor("#272e35")),
    val negative2: Color = Color(parseColor("#3a424a")),
    val negative1: Color = Color(parseColor("#4a545e")),
    val coolGray0: Color = Color(parseColor("#555f6d")),
    val coolGray1: Color = Color(parseColor("#7e8c9a")),
    val coolGray2: Color = Color(parseColor("#9ea8b3")),
    val coolGray3: Color = Color(parseColor("#cfd6dd")),
    val coolGray4: Color = Color(parseColor("#dee3e7")),
    val coolGray5: Color = Color(parseColor("#eaedf0")),
    val coolGray6: Color = Color(parseColor("#f0f3f5")),
    val coolGray7: Color = Color(parseColor("#f5f7f9")),
    val coolGray8: Color = Color(parseColor("#fcfcfd")),
)

data class CoolGrayAlphaValuesContainer(
    val coolGrayANegative4: Color = Color(parseColor("#09131aed")),
    val coolGrayANegative3: Color = Color(parseColor("#0a121ae0")),
    val coolGrayANegative2: Color = Color(parseColor("#1a232ddb")),
    val coolGrayANegative1: Color = Color(parseColor("#1d2835cc")),
    val coolGrayA0: Color = Color(parseColor("#182639bd")),
    val coolGrayA1: Color = Color(parseColor("#1830498f")),
    val coolGrayA2: Color = Color(parseColor("#0d253f66")),
    val coolGrayA3: Color = Color(parseColor("#10315633")),
    val coolGrayA4: Color = Color(parseColor("#04294321")),
    val coolGrayA5: Color = Color(parseColor("#10284717")),
    val coolGrayA6: Color = Color(parseColor("#022e500f")),
    val coolGrayA7: Color = Color(parseColor("#00295c0a")),
    val coolGrayA8: Color = Color(parseColor("#1f529e05")),
)

data class NeutralGrayValuesContainer(
    val negative4: Color = Color(parseColor("#212121")),
    val negative3: Color = Color(parseColor("#2e2e2e")),
    val negative2: Color = Color(parseColor("#404040")),
    val negative1: Color = Color(parseColor("#525252")),
    val neutralGray0: Color = Color(parseColor("#5e5e5e")),
    val neutralGray1: Color = Color(parseColor("#8a8a8a")),
    val neutralGray2: Color = Color(parseColor("#a6a6a6")),
    val neutralGray3: Color = Color(parseColor("#d6d6d6")),
    val neutralGray4: Color = Color(parseColor("#e3e3e3")),
    val neutralGray5: Color = Color(parseColor("#ebebeb")),
    val neutralGray6: Color = Color(parseColor("#f2f2f2")),
    val neutralGray7: Color = Color(parseColor("#f7f7f7")),
    val neutralGray8: Color = Color(parseColor("#fcfcfc")),
)

data class NeutralGrayAlphaValuesContainer(
    val neutralGrayANegative4: Color = Color(parseColor("#121212ed")),
    val neutralGrayANegative3: Color = Color(parseColor("#0f0f0fe0")),
    val neutralGrayANegative2: Color = Color(parseColor("#212121db")),
    val neutralGrayANegative1: Color = Color(parseColor("#262626cc")),
    val neutralGrayA0: Color = Color(parseColor("#262627bd")),
    val neutralGrayA1: Color = Color(parseColor("#2b2b2b8f")),
    val neutralGrayA2: Color = Color(parseColor("#21212166")),
    val neutralGrayA3: Color = Color(parseColor("#2e2e2e33")),
    val neutralGrayA4: Color = Color(parseColor("#1f1f1f21")),
    val neutralGrayA5: Color = Color(parseColor("#1c1c1c17")),
    val neutralGrayA6: Color = Color(parseColor("#2121210f")),
    val neutralGrayA7: Color = Color(parseColor("#2e2e2e0a")),
    val neutralGrayA8: Color = Color(parseColor("#52525205")),
)

data class WarmGrayValuesContainer(
    val negative4: Color = Color(parseColor("#222220")),
    val negative3: Color = Color(parseColor("#30302c")),
    val negative2: Color = Color(parseColor("#40403a")),
    val negative1: Color = Color(parseColor("#52524c")),
    val warmGray0: Color = Color(parseColor("#5f5f58")),
    val warmGray1: Color = Color(parseColor("#8b8b84")),
    val warmGray2: Color = Color(parseColor("#a8a89f")),
    val warmGray3: Color = Color(parseColor("#d9d9d3")),
    val warmGray4: Color = Color(parseColor("#e5e5e1")),
    val warmGray5: Color = Color(parseColor("#eaeae6")),
    val warmGray6: Color = Color(parseColor("#f3f3f1")),
    val warmGray7: Color = Color(parseColor("#f8f8f7")),
    val warmGray8: Color = Color(parseColor("#fdfdfc")),
)

data class WarmGrayAlphaValuesContainer(
    val warmGrayANegative4: Color = Color(parseColor("#131311ed")),
    val warmGrayANegative3: Color = Color(parseColor("#12120de0")),
    val warmGrayANegative2: Color = Color(parseColor("#22221bdb")),
    val warmGrayANegative1: Color = Color(parseColor("#272720cc")),
    val warmGrayA0: Color = Color(parseColor("#26261cbd")),
    val warmGrayA1: Color = Color(parseColor("#2f2f238f")),
    val warmGrayA2: Color = Color(parseColor("#28281166")),
    val warmGrayA3: Color = Color(parseColor("#3e3e1d33")),
    val warmGrayA4: Color = Color(parseColor("#33331421")),
    val warmGrayA5: Color = Color(parseColor("#22220217")),
    val warmGrayA6: Color = Color(parseColor("#2f2f0e0f")),
    val warmGrayA7: Color = Color(parseColor("#2f2f2d0a")),
    val warmGrayA8: Color = Color(parseColor("#52525205")),
)

data class WhiteAlphaValuesContainer(
    val whiteANegative12: Color = Color(parseColor("#ffffff05")),
    val whiteANegative11: Color = Color(parseColor("#ffffff08")),
    val whiteANegative10: Color = Color(parseColor("#ffffff0d")),
    val whiteANegative9: Color = Color(parseColor("#ffffff14")),
    val whiteANegative8: Color = Color(parseColor("#ffffff1a")),
    val whiteANegative7: Color = Color(parseColor("#ffffff1f")),
    val whiteANegative6: Color = Color(parseColor("#ffffff3d")),
    val whiteANegative5: Color = Color(parseColor("#ffffff66")),
    val whiteANegative4: Color = Color(parseColor("#ffffffa3")),
    val whiteANegative3: Color = Color(parseColor("#ffffffad")),
    val whiteANegative2: Color = Color(parseColor("#ffffffb8")),
    val whiteANegative1: Color = Color(parseColor("#ffffffd1")),
    val whiteA0: Color = Color(parseColor("#ffffff")),
)

data class RedValuesContainer1(
    val negative4: Color = Color(parseColor("#4a0d0d")),
    val negative3: Color = Color(parseColor("#6f2020")),
    val negative2: Color = Color(parseColor("#952d2d")),
    val negative1: Color = Color(parseColor("#a13636")),
    val red0: Color = Color(parseColor("#c53434")),
    val red1: Color = Color(parseColor("#f26363")),
    val red2: Color = Color(parseColor("#f49090")),
    val red3: Color = Color(parseColor("#fccfcf")),
    val red4: Color = Color(parseColor("#fcd9d9")),
    val red5: Color = Color(parseColor("#fee7e7")),
    val red6: Color = Color(parseColor("#ffebeb")),
    val red7: Color = Color(parseColor("#fef5f5")),
    val red8: Color = Color(parseColor("#fffafa")),
)

data class MagentaValuesContainer1(
    val negative4: Color = Color(parseColor("#410b2f")),
    val negative3: Color = Color(parseColor("#671e4d")),
    val negative2: Color = Color(parseColor("#892969")),
    val negative1: Color = Color(parseColor("#953274")),
    val magenta0: Color = Color(parseColor("#b12f86")),
    val magenta1: Color = Color(parseColor("#de5eb3")),
    val magenta2: Color = Color(parseColor("#ec89cb")),
    val magenta3: Color = Color(parseColor("#f7cae8")),
    val magenta4: Color = Color(parseColor("#fbd5ee")),
    val magenta5: Color = Color(parseColor("#fde2f4")),
    val magenta6: Color = Color(parseColor("#fdedf8")),
    val magenta7: Color = Color(parseColor("#fef6fb")),
    val magenta8: Color = Color(parseColor("#fffafd")),
)

data class PurpleValuesContainer1(
    val negative4: Color = Color(parseColor("#410b2f")),
    val negative3: Color = Color(parseColor("#5b1e67")),
    val negative2: Color = Color(parseColor("#792989")),
    val negative1: Color = Color(parseColor("#853295")),
    val purple0: Color = Color(parseColor("#9939ac")),
    val purple1: Color = Color(parseColor("#c466db")),
    val purple2: Color = Color(parseColor("#d98eec")),
    val purple3: Color = Color(parseColor("#f4caf7")),
    val purple4: Color = Color(parseColor("#f5d5fb")),
    val purple5: Color = Color(parseColor("#f8e2fd")),
    val purple6: Color = Color(parseColor("#faedfd")),
    val purple7: Color = Color(parseColor("#fdf5ff")),
    val purple8: Color = Color(parseColor("#fefaff")),
)

data class VioletValuesContainer1(
    val negative4: Color = Color(parseColor("#201263")),
    val negative3: Color = Color(parseColor("#39288a")),
    val negative2: Color = Color(parseColor("#4e38bc")),
    val negative1: Color = Color(parseColor("#573fcf")),
    val violet0: Color = Color(parseColor("#634eca")),
    val violet1: Color = Color(parseColor("#927ef1")),
    val violet2: Color = Color(parseColor("#aba2fb")),
    val violet3: Color = Color(parseColor("#dcd6ff")),
    val violet4: Color = Color(parseColor("#e3e0ff")),
    val violet5: Color = Color(parseColor("#eeebff")),
    val violet6: Color = Color(parseColor("#f3f0ff")),
    val violet7: Color = Color(parseColor("#f7f5ff")),
    val violet8: Color = Color(parseColor("#fbfaff")),
)

data class BlueValuesContainer1(
    val negative4: Color = Color(parseColor("#041f5d")),
    val negative3: Color = Color(parseColor("#113997")),
    val negative2: Color = Color(parseColor("#1e4fc2")),
    val negative1: Color = Color(parseColor("#2759ce")),
    val blue0: Color = Color(parseColor("#3061d5")),
    val blue1: Color = Color(parseColor("#6691f4")),
    val blue2: Color = Color(parseColor("#8eb0fb")),
    val blue3: Color = Color(parseColor("#ccdcff")),
    val blue4: Color = Color(parseColor("#d6e3ff")),
    val blue5: Color = Color(parseColor("#e5eeff")),
    val blue6: Color = Color(parseColor("#ebf0ff")),
    val blue7: Color = Color(parseColor("#f5f8ff")),
    val blue8: Color = Color(parseColor("#fafbff")),
)

data class CyanValuesContainer1(
    val negative4: Color = Color(parseColor("#002742")),
    val negative3: Color = Color(parseColor("#0c456e")),
    val negative2: Color = Color(parseColor("#165c8d")),
    val negative1: Color = Color(parseColor("#1b679d")),
    val cyan0: Color = Color(parseColor("#0870ba")),
    val cyan1: Color = Color(parseColor("#5699dc")),
    val cyan2: Color = Color(parseColor("#79bcf6")),
    val cyan3: Color = Color(parseColor("#c2e2ff")),
    val cyan4: Color = Color(parseColor("#cce7ff")),
    val cyan5: Color = Color(parseColor("#e0f1ff")),
    val cyan6: Color = Color(parseColor("#ebf5ff")),
    val cyan7: Color = Color(parseColor("#f0f9ff")),
    val cyan8: Color = Color(parseColor("#fafdff")),
)

data class TealValuesContainer1(
    val negative4: Color = Color(parseColor("#012a37")),
    val negative3: Color = Color(parseColor("#0a495c")),
    val negative2: Color = Color(parseColor("#196076")),
    val negative1: Color = Color(parseColor("#196c85")),
    val teal0: Color = Color(parseColor("#077597")),
    val teal1: Color = Color(parseColor("#4f9eba")),
    val teal2: Color = Color(parseColor("#7ac0dc")),
    val teal3: Color = Color(parseColor("#b8e8f5")),
    val teal4: Color = Color(parseColor("#c5ecf7")),
    val teal5: Color = Color(parseColor("#e0f3fa")),
    val teal6: Color = Color(parseColor("#e8f7fc")),
    val teal7: Color = Color(parseColor("#f0fbff")),
    val teal8: Color = Color(parseColor("#fafeff")),
)

data class AquamarineValuesContainer1(
    val negative4: Color = Color(parseColor("#012d26")),
    val negative3: Color = Color(parseColor("#0d4a42")),
    val negative2: Color = Color(parseColor("#15665b")),
    val negative1: Color = Color(parseColor("#1a7061")),
    val aquamarine0: Color = Color(parseColor("#097b68")),
    val aquamarine1: Color = Color(parseColor("#3da496")),
    val aquamarine2: Color = Color(parseColor("#6ec9bf")),
    val aquamarine3: Color = Color(parseColor("#bee9e4")),
    val aquamarine4: Color = Color(parseColor("#c5f2ec")),
    val aquamarine5: Color = Color(parseColor("#daf6f3")),
    val aquamarine6: Color = Color(parseColor("#e2f8f5")),
    val aquamarine7: Color = Color(parseColor("#f0faf9")),
    val aquamarine8: Color = Color(parseColor("#fbfefe")),
)

data class GreenValuesContainer1(
    val negative4: Color = Color(parseColor("#0a2e0b")),
    val negative3: Color = Color(parseColor("#135315")),
    val negative2: Color = Color(parseColor("#246626")),
    val negative1: Color = Color(parseColor("#2f6f2f")),
    val green0: Color = Color(parseColor("#347434")),
    val green1: Color = Color(parseColor("#55a555")),
    val green2: Color = Color(parseColor("#87c987")),
    val green3: Color = Color(parseColor("#c6ecc6")),
    val green4: Color = Color(parseColor("#cff2cf")),
    val green5: Color = Color(parseColor("#dff6df")),
    val green6: Color = Color(parseColor("#e6f9e6")),
    val green7: Color = Color(parseColor("#f4fbf4")),
    val green8: Color = Color(parseColor("#fbfefb")),
)

data class OrangeValuesContainer1(
    val negative4: Color = Color(parseColor("#492909")),
    val negative3: Color = Color(parseColor("#7a4510")),
    val negative2: Color = Color(parseColor("#a05c1c")),
    val negative1: Color = Color(parseColor("#b4610e")),
    val orange0: Color = Color(parseColor("#f59638")),
    val orange1: Color = Color(parseColor("#f6a351")),
    val orange2: Color = Color(parseColor("#feb871")),
    val orange3: Color = Color(parseColor("#ffd4a8")),
    val orange4: Color = Color(parseColor("#fcdec0")),
    val orange5: Color = Color(parseColor("#ffe8d1")),
    val orange6: Color = Color(parseColor("#fff0e0")),
    val orange7: Color = Color(parseColor("#fff5eb")),
    val orange8: Color = Color(parseColor("#fffcfa")),
)

data class TransparentValuesContainer(
    val transparent: Color = Color(parseColor("#ffffff00")),
)

data class ColorValuesContainer(
    val content: ContentValuesContainer = ContentValuesContainer(),
    val border: BorderValuesContainer = BorderValuesContainer(),
    val background: BackgroundValuesContainer = BackgroundValuesContainer(),
    val action: ActionValuesContainer = ActionValuesContainer(),
    val interaction: InteractionValuesContainer = InteractionValuesContainer(),
    val nonSemantic: NonSemanticValuesContainer = NonSemanticValuesContainer(),
    val semantic: SemanticValuesContainer = SemanticValuesContainer(),
    val coolGray: CoolGrayValuesContainer = CoolGrayValuesContainer(),
    val coolGrayAlpha: CoolGrayAlphaValuesContainer = CoolGrayAlphaValuesContainer(),
    val neutralGray: NeutralGrayValuesContainer = NeutralGrayValuesContainer(),
    val neutralGrayAlpha: NeutralGrayAlphaValuesContainer = NeutralGrayAlphaValuesContainer(),
    val warmGray: WarmGrayValuesContainer = WarmGrayValuesContainer(),
    val warmGrayAlpha: WarmGrayAlphaValuesContainer = WarmGrayAlphaValuesContainer(),
    val whiteAlpha: WhiteAlphaValuesContainer = WhiteAlphaValuesContainer(),
    val red: RedValuesContainer1 = RedValuesContainer1(),
    val magenta: MagentaValuesContainer1 = MagentaValuesContainer1(),
    val purple: PurpleValuesContainer1 = PurpleValuesContainer1(),
    val violet: VioletValuesContainer1 = VioletValuesContainer1(),
    val blue: BlueValuesContainer1 = BlueValuesContainer1(),
    val cyan: CyanValuesContainer1 = CyanValuesContainer1(),
    val teal: TealValuesContainer1 = TealValuesContainer1(),
    val aquamarine: AquamarineValuesContainer1 = AquamarineValuesContainer1(),
    val green: GreenValuesContainer1 = GreenValuesContainer1(),
    val orange: OrangeValuesContainer1 = OrangeValuesContainer1(),
    val transparent: TransparentValuesContainer = TransparentValuesContainer(),
)
