package br.com.flowsample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import br.com.flowsample.ui.nav.ComposeNavGraph
import br.com.flowsample.ui.screens.ScreenBody
import br.com.flowsample.ui.theme.FlowSampleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FlowSampleTheme {
                ScreenBody(topBarTitle = "Flow Samples") {
                    ComposeNavGraph()
                }
            }
        }
    }
}
