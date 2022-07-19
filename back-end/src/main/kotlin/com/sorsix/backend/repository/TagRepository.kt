package com.sorsix.backend.repository

import com.sorsix.backend.domain.Tag
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface TagRepository : JpaRepository<Tag, Long> {
}