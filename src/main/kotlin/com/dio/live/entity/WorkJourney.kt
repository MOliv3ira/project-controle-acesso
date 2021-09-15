package com.dio.live.entity

import javax.persistence.*

@Entity
@Table(name = "tb_work_journey")
data class WorkJourney (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,
    val description: String
    )