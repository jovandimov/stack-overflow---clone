package com.sorsix.backend.domain

import javax.persistence.*

@Entity
@Table(name = "activation_tokens")
data class ActivationToken(
    @Id
    val token: String,

    @OneToOne
    @JoinColumn(name = "app_user_id")
    val user: AppUser

)
