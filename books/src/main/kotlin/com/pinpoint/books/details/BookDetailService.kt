package com.pinpoint.books.details

import org.springframework.stereotype.Service

@Service
class BookDetailService(private val bookRepository: BookRepository) {

    fun findBookDetailById(id: Long): BookDetail {
        return bookRepository.findById(id).get()
    }
}