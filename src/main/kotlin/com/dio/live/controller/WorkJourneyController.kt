package com.dio.live.controller

import com.dio.live.entity.WorkJourney
import com.dio.live.service.JourneyService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/journey")
class WorkJourneyController (
    private val journeyService: JourneyService
){

    @PostMapping
    fun post(@RequestBody workJourney: WorkJourney):WorkJourney{
        return journeyService.save(workJourney)
    }

    @GetMapping
    fun getAll(): List<WorkJourney>{
        return journeyService.findAll()
    }

    @GetMapping("/{id}")
    fun getById(@PathVariable("id") id: Long):ResponseEntity<WorkJourney>{
        return journeyService.findById(id)
            .map {it ->
                ResponseEntity.ok().body(it) }
            .orElse(ResponseEntity.notFound().build())
    }

    @PutMapping("/{id}")
    fun update(@PathVariable("id") id:Long,
               @RequestBody workJourney: WorkJourney):ResponseEntity<WorkJourney> {
        return journeyService.findById(id)
            .map {it ->
                journeyService.save(workJourney)
                ResponseEntity.ok().body(it)}
            .orElse(ResponseEntity.notFound().build())
    }

    @DeleteMapping("/{id}")
    fun delete(@PathVariable("id") id: Long) {
        return journeyService.delete(id)
    }
}