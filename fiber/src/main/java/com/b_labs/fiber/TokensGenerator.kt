package com.b_labs.fiber

import android.content.Context

class TokensGenerator {
    fun getTokens(context: Context) =
        context.assets.open("tokens.json").bufferedReader().use { it.readText() }
}
