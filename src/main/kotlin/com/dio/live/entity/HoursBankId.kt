package com.dio.live.entity

import java.io.Serializable
import javax.persistence.Embeddable

@Embeddable
data class HoursBankId(
    val idHoursBank: Long,
    val idMovement: Long,
    val idUser: Long
):Serializable
