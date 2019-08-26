package com.pinpoint.users.information

import org.springframework.stereotype.Service

@Service
class UserService(private var userRepository: UserRepository) {

    fun findById(id: Long): User {
        return userRepository.findById(id).get()
    }

}