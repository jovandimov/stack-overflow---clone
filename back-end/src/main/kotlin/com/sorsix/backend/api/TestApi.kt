package com.sorsix.backend.api

import com.sorsix.backend.domain.Question
import com.sorsix.backend.repository.AppUserRepository
import com.sorsix.backend.repository.QuestionRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/test")
class TestApi(
    val questionRepository: QuestionRepository,
    val appUserRepository: AppUserRepository
) {

    @GetMapping
    fun getList(): MutableList<Question> = questionRepository.findAll();
}