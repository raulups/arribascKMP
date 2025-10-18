package com.arribasc.fomo.di

import androidx.sqlite.driver.bundled.BundledSQLiteDriver
import com.arribasc.fomo.core.data.HttpClientFactory
import org.koin.core.module.Module
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module

expect val platformModule: Module

val sharedModule = module {
    single { HttpClientFactory.create(get()) }
}