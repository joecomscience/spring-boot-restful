package com.pinpoint.books.book

import org.springframework.stereotype.Service

@Service
class BookService(private val bookRepository: BookRepository) {

    fun findAllBooks(): ArrayList<String> {
        val books: ArrayList<String> = ArrayList()
        bookRepository
                .findAll()
                .forEach {
                    books.add(it.bookname)
                }

        return books
    }

    fun findBookDetailById(id: Long): BookEntity {
        return bookRepository.findById(id).get()
    }
}