package com.pinpoint.books

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BooksApplication

fun main(args: Array<String>) {
	runApplication<BooksApplication>(*args)
}
