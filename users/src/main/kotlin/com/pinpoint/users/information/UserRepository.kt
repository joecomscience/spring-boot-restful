package com.pinpoint.users.information

import org.springframework.data.repository.CrudRepository

interface UserRepository : CrudRepository<User, Long>