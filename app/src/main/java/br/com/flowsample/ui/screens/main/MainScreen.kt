package br.com.flowsample.ui.screens.main

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import br.com.flowsample.R
import br.com.flowsample.ui.screens.SampleButton
import br.com.flowsample.ui.screens.Screen

@Composable
fun MainScreen(navController: NavHostController) {
    Column(
        modifier = Modifier.fillMaxSize(1.0f),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {
        SampleButton(text = stringResource(id = R.string.flowSample1), onclick = {
            navController.navigate(Screen.FlowVsSharedFlow.route)
        })

        SampleButton(text = stringResource(id = R.string.flowSample2)) {
            navController.navigate(Screen.CouldFlowVsHotFlow.route)
        }

        SampleButton(text = stringResource(id = R.string.flowSample3)) {
            navController.navigate(Screen.FlowFunctions.route)
        }
    }
}

@Preview
@Composable
fun PreviewMainScreen() {
    MainScreen(rememberNavController())
}
