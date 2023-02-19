package com.service.kafka.config

import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.JsonSerializable
import org.apache.kafka.clients.producer.KafkaProducer
import org.apache.kafka.clients.producer.ProducerConfig
import org.apache.kafka.common.serialization.StringSerializer
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class KafkaConfig {
    @Value("\${bootstrap.servers}")
    private lateinit var servers: String

    private fun config() : Map<String, Any> {
        return HashMap<String, Any>().apply {
            put(
                ProducerConfig.BOOTSTRAP_SERVERS_CONFIG,
                servers
            )
            put(
                ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG,
                StringSerializer::class.java
            )
            put(
                ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG,
                JsonSerializable::class.java
            )
        }
    }

    @Bean
    fun producerJson() : KafkaProducer<String, JsonNode> =
        KafkaProducer(config())
}