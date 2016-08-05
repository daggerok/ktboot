package com.daggerok.domain

import org.springframework.data.jpa.repository.JpaRepository
import java.util.stream.Stream

/**
 * Created by mak on 8/5/16.
 */
interface UserRepository : JpaRepository<User, Long> {
    fun findByName(name: String): Stream<User>
}
