package com.dio.live.entity

import java.math.BigDecimal
import java.time.LocalDateTime
import javax.persistence.EmbeddedId
import javax.persistence.Entity
import javax.persistence.ManyToOne
import javax.persistence.Table

@Entity
@Table(name = "tb_movement")
data class Movement(

    @EmbeddedId
    val movementId: MovementId,
    val exitDate: LocalDateTime,
    val EntryDate: LocalDateTime,
    val stayPeriod: BigDecimal,
    @ManyToOne
    val occurrence: Occurrence,
    @ManyToOne
    val calendar: Calendar
)


