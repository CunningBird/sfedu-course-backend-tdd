package com.example.tddapplication.repository

interface FlexRepository {

    fun save(foo: String, bar: Int): Boolean
}