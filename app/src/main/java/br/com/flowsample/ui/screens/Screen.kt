package br.com.flowsample.ui.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.ui.Modifier

sealed class Screen(val route: String) {
    @Immutable
    object Main : Screen("main")

    @Immutable
    object FlowVsSharedFlow : Screen("flowAnSharedFlow")

    @Immutable
    object CouldFlowVsHotFlow : Screen("couldFlowVsHotFlow")

    @Immutable
    object FlowFunctions : Screen("flowFunctions")
}


@Composable
fun Screen(modifier: Modifier = Modifier, content: @Composable () -> Unit) {
    Surface(
        modifier = modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background,
        content = content,
    )
}
