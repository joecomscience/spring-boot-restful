package com.pinpoint.books.details

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class BookDetailController @Autowired constructor(private val bookDetailService: BookDetailService) {

    @GetMapping("/detail/{id}")
    fun getBookDetails(@PathVariable id: Long): ResponseEntity<BookDetail> {
        val bookDetail = bookDetailService.findBookDetailById(id)
        return ResponseEntity(bookDetail, HttpStatus.OK)
    }
}