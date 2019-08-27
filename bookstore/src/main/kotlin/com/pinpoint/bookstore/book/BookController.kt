package com.pinpoint.bookstore.book

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class BookController(private val bookService: BookService) {
    @GetMapping("/books")
    fun getBookList(): ResponseEntity<Array<String>> {
        val books = bookService.getAllBooks()
        return ResponseEntity(books, HttpStatus.OK)
    }

    @GetMapping("/book/{id}")
    fun getBookDetail(@PathVariable id: Long): ResponseEntity<BookDetail> {
        val bookDetail = bookService.getBookDetail(id)
        return ResponseEntity(bookDetail, HttpStatus.OK)
    }
}