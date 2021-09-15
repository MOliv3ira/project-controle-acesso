package com.dio.live.repository

import com.dio.live.entity.WorkJourney
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface WorkJourneyRepository: JpaRepository<WorkJourney, Long> {

}