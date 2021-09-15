package com.dio.live.entity

import java.io.Serializable
import javax.persistence.Embeddable

@Embeddable
class MovementId(
    val idMovement: Long,
    val idUser: Long
    ): Serializable




