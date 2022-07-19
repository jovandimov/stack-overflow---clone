package com.sorsix.backend.api

import com.sorsix.backend.domain.Tag
import com.sorsix.backend.service.TagService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.Mapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import javax.persistence.ManyToOne

@RestController
@RequestMapping("/api/tag")
class TagController(
    val tagService: TagService
) {

    @GetMapping
    fun getTags(): List<Tag>? {
        return tagService.getAllTags();
    }

}