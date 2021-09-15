package com.dio.live.entity

import javax.persistence.*

@Entity
@Table(name = "tb_location")
data class Location(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,
    @ManyToOne
    val accessLevel: AccessLevel,
    val description: String
)
