package com.pinpoint.users.user

import javax.persistence.*

@Entity
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