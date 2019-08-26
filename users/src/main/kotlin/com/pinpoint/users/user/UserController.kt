package com.pinpoint.users.user

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class UserController @Autowired constructor(val userService: UserService) {

    @GetMapping("/{id}")
    fun getUserById(@PathVariable id: Long): User {
        return userService.findById(id)
    }
}