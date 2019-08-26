package com.pinpoint.users.user

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class UserController(private var userService: UserService) {

    @GetMapping("/{id}")
    fun getUserById(id: Int): ResponseEntity<User> {
        val user = userService.findById(id)
        return ResponseEntity(user, HttpStatus.OK)
    }
}