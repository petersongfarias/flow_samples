package br.com.flowsample.ui.nav

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import br.com.flowsample.ui.screens.Screen
import br.com.flowsample.ui.screens.flowSharedFlow.FlowVsSharedFlowScreen
import br.com.flowsample.ui.screens.main.MainScreen

@Composable
fun ComposeNavGraph(navController: NavHostController = rememberNavController()) {
    NavHost(navController = navController, startDestination = Screen.Main.route) {
        composable(route = Screen.Main.route) { MainScreen(navController = navController) }
        composable(route = Screen.FlowVsSharedFlow.route) { FlowVsSharedFlowScreen() }
        composable(route = Screen.CouldFlowVsHotFlow.route) { FlowVsSharedFlowScreen() }
        composable(route = Screen.FlowFunctions.route) { FlowVsSharedFlowScreen() }
    }
}
