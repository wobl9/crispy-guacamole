package com.wobcorp.crispyguacamole

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.setContent
import androidx.compose.ui.unit.dp

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            setupHelloWorld()
        }
    }

    @Composable
    fun setupHelloWorld() {
        Column(
            modifier = Modifier.padding(all = 16.dp)
        ) {
            Text(text = "Dimas")
            Text(text = "Hello compose!")
        }
    }
}