package com.dio.live.entity

import javax.persistence.*

@Entity
@Table(name = "tb_occurrence")
data class Occurrence(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,
    val name: String,
    val description: String
)
