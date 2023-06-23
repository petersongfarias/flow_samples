package br.com.flowsample.di

import kotlinx.coroutines.Dispatchers
import org.koin.core.qualifier.named
import org.koin.dsl.module

val dispatcherModule = module {
    single(named(DefaultDispatchers.IO)) {
        Dispatchers.IO
    }

    single(named(DefaultDispatchers.Main)) {
        Dispatchers.Main
    }

    single(named(DefaultDispatchers.Default)) {
        Dispatchers.Default
    }
}

object DefaultDispatchers {
    const val IO = "io"
    const val Main = "main"
    const val Default = "default"
}
