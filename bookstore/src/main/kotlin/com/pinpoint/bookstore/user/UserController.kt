package com.pinpoint.bookstore.user

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class UserController(private val userService: UserService) {

    @GetMapping("/user/{id}")
    fun getCurrentUser(@PathVariable id: Long): ResponseEntity<UserInfo> {
        val userInfo = userService.getCurrentUser(id)
        return ResponseEntity(userInfo, HttpStatus.OK)
    }

}