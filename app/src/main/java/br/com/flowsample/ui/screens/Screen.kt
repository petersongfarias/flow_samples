@file:OptIn(ExperimentalMaterial3Api::class)

package br.com.flowsample.ui.screens

import android.app.Activity
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext

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
fun ScreenBody(topBarTitle: String, content: @Composable () -> Unit) {
    val activity = (LocalContext.current as? Activity)

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(topBarTitle) },
            )
        },
    ) { padding ->
        Surface(
            modifier = Modifier.padding(padding),
            color = MaterialTheme.colorScheme.background,
            content = content,
        )
    }
}
