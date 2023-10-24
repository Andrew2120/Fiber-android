package com.b_labs.mylo.tokens


data class ActionValuesContainer(
    val primary: PrimaryValuesContainer = PrimaryValuesContainer(),
    val neutral: NeutralValuesContainer = NeutralValuesContainer(),
    val success: SuccessValuesContainer = SuccessValuesContainer(),
    val danger: DangerValuesContainer = DangerValuesContainer(),
    val ghost: GhostValuesContainer = GhostValuesContainer(),
    val outline: OutlineValuesContainer = OutlineValuesContainer(),
    val inverse: InverseValuesContainer = InverseValuesContainer(),
    val reverseInverse: ReverseInverseValuesContainer = ReverseInverseValuesContainer(),
)