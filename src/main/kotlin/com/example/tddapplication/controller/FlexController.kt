package com.example.tddapplication.controller

import com.example.tddapplication.dto.FlexRequest
import com.example.tddapplication.service.FlexService

class FlexController(
    private val service: FlexService
) {

    fun saveRequest(request: FlexRequest): Boolean {
        return service.saveToDB(request)
    }
}