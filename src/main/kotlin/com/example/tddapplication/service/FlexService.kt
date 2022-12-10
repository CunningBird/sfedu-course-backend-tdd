package com.example.tddapplication.service

import com.example.tddapplication.dto.FlexRequest

interface FlexService {

    fun saveToDB(data: FlexRequest): Boolean
}