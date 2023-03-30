package com.example.cryptocurrencyapp.domain

class LoadDataUseCase(
    private val repository: CoinRepository
) {

    operator fun invoke() = repository.loadData()
}