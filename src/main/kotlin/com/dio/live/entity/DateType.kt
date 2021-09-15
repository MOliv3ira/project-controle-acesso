package com.dio.live.entity

import javax.persistence.*

@Entity
@Table(name = "tb_date_type")
data class DateType(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,
    val description: String
)
