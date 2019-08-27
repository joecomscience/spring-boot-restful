package com.pinpoint.books.book

import org.springframework.data.repository.CrudRepository

interface BookRepository : CrudRepository<BookEntity, Long>