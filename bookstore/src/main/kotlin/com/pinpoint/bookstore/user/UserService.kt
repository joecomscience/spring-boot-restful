package com.pinpoint.bookstore.user

import org.springframework.stereotype.Service
import org.springframework.web.client.RestTemplate

@Service
class UserService {
    private val host: String = "http://localhost:8803/api/{id}"

    fun getCurrentUser(id: Long): UserInfo? {
        return RestTemplate().getForObject(host, UserInfo::class.java, id)
    }
}