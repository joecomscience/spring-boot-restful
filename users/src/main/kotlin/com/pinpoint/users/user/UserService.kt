package com.pinpoint.users.user

import org.springframework.stereotype.Service

@Service
class UserService(val userRepository: UserRepository) {

    fun findById(id: Long): User {
        return userRepository.findById(id).get()
    }
}