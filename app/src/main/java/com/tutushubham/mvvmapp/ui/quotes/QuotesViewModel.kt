package com.tutushubham.mvvmapp.ui.quotes

import androidx.lifecycle.ViewModel
import com.tutushubham.mvvmapp.data.Quote
import com.tutushubham.mvvmapp.data.QuoteRepository

class QuotesViewModel(private val quoteRepository : QuoteRepository) : ViewModel() {

    fun getQuotes() = quoteRepository.getQuote()

    fun addQuote(quote: Quote) = quoteRepository.addQuote(quote)
}