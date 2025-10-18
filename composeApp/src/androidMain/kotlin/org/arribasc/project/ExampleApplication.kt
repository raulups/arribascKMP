package org.arribasc.project

import android.app.Application
import com.arribasc.fomo.di.initKoin
import org.koin.android.ext.koin.androidContext

class ExampleApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        initKoin {
            androidContext(this@ExampleApplication)
        }
    }
}