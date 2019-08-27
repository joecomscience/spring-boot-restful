package com.pinpoint.books.book

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class BookController @Autowired constructor(private val bookService: BookService) {

    @GetMapping("/books")
    fun getAllBook(): ResponseEntity<ArrayList<String>> {
        val books = bookService.findAllBooks()
        return ResponseEntity(books, HttpStatus.OK)
    }

    @GetMapping("/book/{id}")
    fun getBookDetail(@PathVariable id: Long): ResponseEntity<BookEntity> {
        val bookDetail = bookService.findBookDetailById(id)
        return ResponseEntity(bookDetail, HttpStatus.OK)
    }
}