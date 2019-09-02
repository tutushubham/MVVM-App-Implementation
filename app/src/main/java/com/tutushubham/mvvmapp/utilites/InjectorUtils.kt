package com.tutushubham.mvvmapp.utilites

import com.tutushubham.mvvmapp.data.FakeDatabase
import com.tutushubham.mvvmapp.data.QuoteRepository
import com.tutushubham.mvvmapp.ui.quotes.QuotesViewModelFactory

object InjectorUtils {

    fun provideQuotesViewModelFactory(): QuotesViewModelFactory{
        val quoteRepository = QuoteRepository.getInstance(FakeDatabase.getInstance().quoteDao)
        return QuotesViewModelFactory(quoteRepository)
    }
}