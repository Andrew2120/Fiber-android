package com.b_labs.fiber

import android.content.Context
import com.google.gson.Gson

class TokensGenerator {
    fun getTokens(context: Context): Tokens {
        val jsonString: String =
            context.assets.open("tokens.json").bufferedReader().use { it.readText() }

        return Gson().fromJson(jsonString, Tokens::class.java)
    }
}
