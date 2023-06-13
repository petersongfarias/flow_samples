package br.com.flowsample.ui.nav

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import br.com.flowsample.ui.screens.Screen

@Composable
fun ComposeNavGraph() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Screen.Main.route) {
        composable(
            route = Screen.Main.route,
        ) {}
        composable(
            route = Screen.FlowVsSharedFlow.route,
        ) {}
        composable(
            route = Screen.CouldFlowVsHotFlow.route,
        ) {}
        composable(
            route = Screen.FlowFunctions.route,
        ) {}
    }
}
