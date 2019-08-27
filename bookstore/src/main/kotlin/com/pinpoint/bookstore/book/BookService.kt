package com.pinpoint.bookstore.book

import org.springframework.stereotype.Service
import org.springframework.web.client.RestTemplate

@Service
class BookService {

    private val host: String = "http://localhost:8081/api"

    fun getAllBooks(): Array<String>? {
        val url = "$host/books"
        return RestTemplate().getForObject(url, Array<String>::class.java)
    }

    fun getBookDetail(id: Long): BookDetail? {
        val url = "$host/book/{id}"
        return RestTemplate().getForObject(url, BookDetail::class.java, id)
    }
}