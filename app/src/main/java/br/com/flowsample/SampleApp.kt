package br.com.flowsample

import android.app.Application
import br.com.flowsample.di.dispatcherModule
import br.com.flowsample.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class SampleApp : Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin {
            // Log Koin into Android logger
            androidLogger(Level.DEBUG)
            // Reference Android context
            androidContext(this@SampleApp)
            // Load modules
            modules(
                listOf(
                    dispatcherModule,
                    viewModelModule,
                ),
            )
        }
    }
}
