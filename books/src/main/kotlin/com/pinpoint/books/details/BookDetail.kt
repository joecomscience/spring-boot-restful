package com.pinpoint.books.details

import javax.persistence.*

@Entity
@Table(name = "books")
class BookDetail(
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