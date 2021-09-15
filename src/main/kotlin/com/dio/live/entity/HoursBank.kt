package com.dio.live.entity

import java.math.BigDecimal
import java.time.LocalDateTime
import javax.persistence.EmbeddedId
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "tb_hours_bank")
data class HoursBank(
    @EmbeddedId
    val IdHoursBank: HoursBankId,
    val dateWork: LocalDateTime,
    val qtdWorkedHours: BigDecimal,
    val hoursBalance: BigDecimal



)
