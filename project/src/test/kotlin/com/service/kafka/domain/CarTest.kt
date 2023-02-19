package com.service.kafka.domain

import io.kotest.core.spec.style.FunSpec
import io.kotest.core.spec.style.ShouldSpec
import io.kotest.matchers.shouldBe
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ContextConfiguration
import org.springframework.test.context.junit.jupiter.SpringExtension
import java.util.*

//@SpringBootTest
//class CarTest: FunSpec() {
//    override fun extensions() = listOf(SpringExtension)
//
//    init {
//        context("Test functions car") {
//            test("Should return a list of car") {
//                val car: Car = Car(UUID.randomUUID(), CarEnum.CHOUVER.toString())
//
//                car.create() shouldBe listOf()
//            }
//        }
//    }
//}

class MoneyTests : ShouldSpec({
    should("Convert input money to the target currency") {
        // test code
    }
})
