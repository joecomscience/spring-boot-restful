package com.pinpoint.users.user

import org.springframework.data.jpa.repository.config.EnableJpaRepositories
import org.springframework.data.repository.CrudRepository

@EnableJpaRepositories
interface UserRepository : CrudRepository<User, Long>