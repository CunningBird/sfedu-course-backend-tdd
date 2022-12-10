package com.example.tddapplication.service

import com.example.tddapplication.dto.FlexRequest
import com.example.tddapplication.repository.FlexRepository

class FlexServiceImpl(
    private val repository: FlexRepository
) : FlexService {

    override fun saveToDB(data: FlexRequest): Boolean {
        return repository.save(data.bar.toString(), data.bar)
    }
}