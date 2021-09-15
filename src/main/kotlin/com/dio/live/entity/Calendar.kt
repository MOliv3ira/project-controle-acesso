package com.dio.live.entity

import java.time.LocalDateTime
import javax.persistence.*

@Entity
@Table(name = "tb_calendar")
data class Calendar(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,
    @ManyToOne
    val idDateType: DateType,
    val description: String,
    val date: LocalDateTime
)
