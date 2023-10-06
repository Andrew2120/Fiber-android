package com.b_labs.fiber

import com.google.gson.annotations.SerializedName

data class Tokens(
    @SerializedName("global")
    val global: Global? = null,
) {
    data class Global(
        @SerializedName("large")
        val large: Large? = null,
        @SerializedName("medium")
        val medium: Medium? = null,
        @SerializedName("small")
        val small: Small? = null,
        @SerializedName("xlarge")
        val xlarge: Xlarge? = null,
    ) {
        data class Large(
            @SerializedName("type")
            val type: String? = null,
            @SerializedName("value")
            val value: String? = null,
        )

        data class Medium(
            @SerializedName("type")
            val type: String? = null,
            @SerializedName("value")
            val value: String? = null,
        )

        data class Small(
            @SerializedName("type")
            val type: String? = null,
            @SerializedName("value")
            val value: String? = null,
        )

        data class Xlarge(
            @SerializedName("type")
            val type: String? = null,
            @SerializedName("value")
            val value: String? = null,
        )
    }

    data class Metadata(
        @SerializedName("tokenSetOrder")
        val tokenSetOrder: List<String?>? = null,
    )
}
