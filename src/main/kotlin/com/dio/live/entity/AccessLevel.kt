package com.dio.live.entity

import javax.persistence.*

@Entity
@Table(name = "tb_access_level")
data class AccessLevel(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,
    val description: String
)
