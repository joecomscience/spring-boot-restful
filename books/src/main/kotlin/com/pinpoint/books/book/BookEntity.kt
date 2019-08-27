package com.pinpoint.books.book

import javax.persistence.*

@Entity
@Table(name = "books")
class BookEntity(
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        val id: Long = 0,

        @Column
        val author: String,
        @Column
        val bookname: String,
        @Column
        val total: Int
)