package com.b_labs.apptest

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.b_labs.apptest.ui.theme.FiberandroidTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FiberandroidTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    // color = FiberTheme.colors.color.coolGray.negative4,
                ) {
                    Column() {
//                        val designSystem = com.b_labs.retail.tokens.designSystem
//                        CompositionLocalProvider(localColors provides designSystem) {
//                            Design().PrimaryButton()
//                        }
//
//                        val deelDesignSystem = com.b_labs.deel.tokens.designSystem
//                        CompositionLocalProvider(localColors provides deelDesignSystem) {
//                            Design().PrimaryButton()
//                        }
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier,
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    FiberandroidTheme {
        Greeting("Android")
    }
}