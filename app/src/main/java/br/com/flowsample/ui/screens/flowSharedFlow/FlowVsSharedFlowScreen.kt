package br.com.flowsample.ui.screens.flowSharedFlow

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun FlowVsSharedFlowScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 16.dp),
        horizontalAlignment = CenterHorizontally,
        verticalArrangement = Arrangement.Top,
    ) {
        Text(
            text = "",
            fontSize = 26.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier.align(
                alignment = CenterHorizontally,
            ),
        )
    }
}
