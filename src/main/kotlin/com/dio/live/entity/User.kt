package com.dio.live.entity

import java.math.BigDecimal
import java.time.LocalDateTime
import javax.persistence.*

@Entity
@Table(name = "tb_user")
data class User(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,
    val name: String,
    @ManyToOne
    val userCategory: UserCategory,
    @ManyToOne
    val company: Company,
    @ManyToOne
    val accessLevel: AccessLevel,
    @ManyToOne
    val workJourney: WorkJourney,
    val tolerance: BigDecimal,
    val startTime: LocalDateTime,
    val exitTime: LocalDateTime
)
