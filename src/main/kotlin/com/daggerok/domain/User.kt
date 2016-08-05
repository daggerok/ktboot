package com.daggerok.domain

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

/**
 * Created by mak on 8/5/16.
 */
@Entity
data class User(var name: String = "") {
    @Id @GeneratedValue(strategy = GenerationType.AUTO) var id: Long = -1
}
