package br.com.flowsample.di

import br.com.flowsample.ui.screens.flowSharedFlow.FlowVsSharedFlowViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel {
        FlowVsSharedFlowViewModel()
    }
}
