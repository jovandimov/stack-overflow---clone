package com.sorsix.backend.repository

import com.sorsix.backend.domain.QuestionTag
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface QuestionTagRepository : JpaRepository<QuestionTag,Long>{
}