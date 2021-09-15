package com.dio.live.service

import com.dio.live.entity.WorkJourney
import com.dio.live.repository.WorkJourneyRepository
import org.springframework.stereotype.Service
import java.util.*

@Service
class JourneyService(
    private val  journeyRepository: WorkJourneyRepository
) {

    fun save(workJourney: WorkJourney):WorkJourney{
        return journeyRepository.save(workJourney)
    }

    fun findAll(): List<WorkJourney> {
      return journeyRepository.findAll()
    }
    fun findById(id:Long):Optional<WorkJourney>{
        return journeyRepository.findById(id)
    }

    fun update(workJourney: WorkJourney):WorkJourney{
        return journeyRepository.save(workJourney)
    }

    fun delete(id: Long){
        return journeyRepository.deleteById(id)
    }
}