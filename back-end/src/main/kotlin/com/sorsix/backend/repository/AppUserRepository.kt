package com.sorsix.backend.repository

import com.sorsix.backend.domain.AppUser
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface AppUserRepository : JpaRepository<AppUser,Long> {
}