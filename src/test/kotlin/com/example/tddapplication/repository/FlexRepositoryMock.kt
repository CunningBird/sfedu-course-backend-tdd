package com.example.tddapplication.repository

class FlexRepositoryMock : FlexRepository {

    private val storage: MutableList<Pair<String, Int>> = mutableListOf()

    override fun save(foo: String, bar: Int): Boolean {
        return storage.add(Pair(foo, bar))
    }
}