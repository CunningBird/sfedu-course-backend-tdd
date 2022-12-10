package com.example.tddapplication.controller

import com.example.tddapplication.dto.FlexRequest
import com.example.tddapplication.service.FlexServiceMock
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class FlexControllerTest {

    private val flexController = FlexController(FlexServiceMock())

    @Test
    fun test1() {
        val request = FlexRequest("Foo", 228)
        val response = flexController.saveRequest(request)

        Assertions.assertEquals(true, response)
    }
}