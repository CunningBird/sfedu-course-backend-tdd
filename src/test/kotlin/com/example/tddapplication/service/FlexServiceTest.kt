package com.example.tddapplication.service

import com.example.tddapplication.dto.FlexRequest
import com.example.tddapplication.repository.FlexRepositoryMock
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class FlexServiceTest {

    private val service = FlexServiceImpl(FlexRepositoryMock())

    @Test
    fun test1() {
        val expected = true

        val request = FlexRequest("flex", 337)
        val actual = service.saveToDB(request)

        Assertions.assertEquals(expected, actual)
    }
}