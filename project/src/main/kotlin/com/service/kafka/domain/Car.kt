package com.service.kafka.domain

import java.util.*

data class Car(val id: UUID, val type: String) {
    fun create(): List<String> {
        when(type) {
            CarEnum.HONDA.toString() -> throw Exception("This type is not permitted")
        }

        val list = listOf<String>();

        return list;
    }
}