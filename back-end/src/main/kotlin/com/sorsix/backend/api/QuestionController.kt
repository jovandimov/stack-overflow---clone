package com.sorsix.backend.api

import com.sorsix.backend.domain.Question
import com.sorsix.backend.repository.QuestionRepository
import com.sorsix.backend.service.QuestionService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/questions")
class QuestionController(
    val questionService: QuestionService
) {

    @GetMapping
    fun getAll(): List<Question>? {
        return questionService.findAll();
    }

    @GetMapping("/withoutAnswers")
    fun getAllQuestionsWithoutAnswers(): List<Question>? {
        return questionService.findAllQuestionsWithoutAnswers();
    }
}