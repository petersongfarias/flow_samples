package br.com.flowsample.ui.screens

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

private val mainButtonModifier = Modifier
    .fillMaxWidth()
    .padding(horizontal = 24.dp, vertical = 8.dp)

@Composable
fun SampleButton(text: String, onclick: () -> Unit) {
    Button(
        modifier = mainButtonModifier,
        onClick = {
            onclick()
        },
    ) {
        Text(text = text)
    }
}
