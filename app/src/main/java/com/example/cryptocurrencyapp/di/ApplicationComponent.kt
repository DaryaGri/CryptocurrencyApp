package com.example.cryptocurrencyapp.di

import android.app.Application
import com.example.cryptocurrencyapp.presentation.CoinApp
import com.example.cryptocurrencyapp.presentation.CoinDetailFragment
import com.example.cryptocurrencyapp.presentation.CoinPriceListActivity
import dagger.BindsInstance
import dagger.Component

@ApplicationScope
@Component(modules = [DataModule::class, ViewModelModule::class, WorkerModule::class])
interface ApplicationComponent {

    fun inject(activity: CoinPriceListActivity)

    fun inject(fragment: CoinDetailFragment)

    fun inject(application: CoinApp)

    @Component.Factory
    interface Factory {

        fun create(@BindsInstance application: Application): ApplicationComponent
    }
}