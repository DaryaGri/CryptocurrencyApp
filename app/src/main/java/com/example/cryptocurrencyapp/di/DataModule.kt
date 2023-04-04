package com.example.cryptocurrencyapp.di

import android.app.Application
import com.example.cryptocurrencyapp.data.database.AppDatabase
import com.example.cryptocurrencyapp.data.database.CoinInfoDao
import com.example.cryptocurrencyapp.data.network.ApiFactory
import com.example.cryptocurrencyapp.data.network.ApiService
import com.example.cryptocurrencyapp.data.repository.CoinRepositoryImpl
import com.example.cryptocurrencyapp.domain.CoinRepository
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
interface DataModule {

    @Binds
    @ApplicationScope
    fun bindCoinRepository(impl: CoinRepositoryImpl): CoinRepository

    companion object {
        @Provides
        @ApplicationScope
        fun provideCoinInfoDao(application: Application): CoinInfoDao {
            return AppDatabase.getInstance(application).coinPriceInfoDao()
        }

        @Provides
        @ApplicationScope
        fun provideApiService(): ApiService {
            return ApiFactory.apiService
        }
    }
}