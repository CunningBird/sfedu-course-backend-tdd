package com.example.tddapplication.service

import com.example.tddapplication.dto.FlexRequest
import com.example.tddapplication.service.FlexService

class FlexServiceMock : FlexService {

    override fun saveToDB(data: FlexRequest): Boolean {
        return true
    }
}