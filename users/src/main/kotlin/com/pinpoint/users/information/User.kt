package com.pinpoint.users.information

import javax.persistence.*

@Entity
@Table(name = "users")
class User(
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        val id: Long = 0,

        @Column
        val firstname: String,
        @Column
        val lastname: String,
        @Column
        val age: Int
)