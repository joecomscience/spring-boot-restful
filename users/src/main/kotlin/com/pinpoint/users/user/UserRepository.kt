package com.pinpoint.users.user

import org.springframework.data.repository.CrudRepository

interface UserRepository : CrudRepository<User, Int>