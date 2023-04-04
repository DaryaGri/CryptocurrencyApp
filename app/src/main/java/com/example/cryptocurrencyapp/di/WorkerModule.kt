package com.example.cryptocurrencyapp.di

import androidx.work.ListenableWorker
import com.example.cryptocurrencyapp.data.workers.ChildWorkerFactory
import com.example.cryptocurrencyapp.data.workers.RefreshDataWorker
import com.example.cryptocurrencyapp.di.WorkerKey
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
interface WorkerModule {

    @Binds
    @IntoMap
    @WorkerKey(RefreshDataWorker::class)
    fun bindRefreshDataWorkerFactory(worker: RefreshDataWorker.Factory): ChildWorkerFactory
}