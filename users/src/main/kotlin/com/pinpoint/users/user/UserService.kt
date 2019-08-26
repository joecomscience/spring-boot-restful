package com.pinpoint.users.user

import org.springframework.stereotype.Service

@Service
class UserService(private var userRepository: UserRepository) {

    fun findById(id: Int): User {
        return userRepository.findById(id).get()
    }
}