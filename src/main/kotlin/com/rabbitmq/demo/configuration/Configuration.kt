package com.rabbitmq.demo.configuration

import org.springframework.amqp.core.Queue
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class Configuration {

    @Bean
    fun queue(): Queue {
        return Queue("sample-queue", true)
    }
}