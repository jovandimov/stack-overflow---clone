package com.sorsix.backend.service

import com.sorsix.backend.domain.Question
import com.sorsix.backend.repository.QuestionRepository
import com.sorsix.backend.repository.QuestionTagRepository
import com.sorsix.backend.repository.TagRepository
import org.springframework.stereotype.Service

@Service
class QuestionService(
    val questionRepository: QuestionRepository,
    val tagRepository: TagRepository,
    val questionTagRepository: QuestionTagRepository
) {

    fun findAllQuestionsWithoutAnswers(): List<Question>? {
        return questionRepository.findAll().filter { it.parentQuestion == null };
    }

    fun findAll(): List<Question>? {
        return questionRepository.findAll();
    }

    fun saveQuestion(){

    }

}