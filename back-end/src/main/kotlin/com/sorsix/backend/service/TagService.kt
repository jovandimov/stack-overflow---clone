package com.sorsix.backend.service

import com.sorsix.backend.domain.Tag
import com.sorsix.backend.repository.TagRepository
import org.springframework.stereotype.Repository
import org.springframework.stereotype.Service

@Service
class TagService(
    val tagRepository: TagRepository
) {

    fun getAllTags():List<Tag>?{
        return tagRepository.findAll()
    }


}