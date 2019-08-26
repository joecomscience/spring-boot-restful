package com.pinpoint.books.details

import org.springframework.data.repository.CrudRepository

interface BookRepository : CrudRepository<BookDetail, Long>