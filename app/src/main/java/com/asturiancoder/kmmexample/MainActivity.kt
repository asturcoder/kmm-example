package com.asturiancoder.kmmexample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.asturiancoder.kmmexample.shared.Greeting
import com.asturiancoder.kmmexample.ui.theme.KMMExampleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val greeting = Greeting().greeting()

        setContent {
            KMMExampleTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    Greeting(greeting)
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = name)
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    KMMExampleTheme {
        Greeting("Android")
    }
}