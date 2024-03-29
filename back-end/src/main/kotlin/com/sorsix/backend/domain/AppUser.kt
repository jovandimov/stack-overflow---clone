package com.sorsix.backend.domain

import com.sorsix.backend.domain.enum.AppUserRole
import javax.persistence.*

@Entity
@Table(name = "app_users")
data class AppUser(
    @Id
    @GeneratedValue
    val id: Long,
    val username: String,
    val name: String,
    val surname: String,
    val email: String,
    @Enumerated(value = EnumType.STRING)
    val appUserRole: AppUserRole,

)
