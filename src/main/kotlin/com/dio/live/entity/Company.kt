package com.dio.live.entity

import javax.persistence.*

@Entity
@Table(name = "tb_company")
data class Company(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,
    val description:String,
    val cnpj:String,
    val address: String,
    val district:String,
    val city: String,
    val state: String,
    val telephone: String

)
