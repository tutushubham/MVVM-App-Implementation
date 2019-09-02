package com.tutushubham.mvvmapp.data

data class Quote (val quoteString: String, val author : String){
    override fun toString(): String {
        return "$quoteString - $author"
    }
}