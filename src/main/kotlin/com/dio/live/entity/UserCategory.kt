package com.dio.live.entity

import javax.persistence.*

@Entity
@Table(name = "tb_user_category")
data class UserCategory(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,
    val description: String?

)
