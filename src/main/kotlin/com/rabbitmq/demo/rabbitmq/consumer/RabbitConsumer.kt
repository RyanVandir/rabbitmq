package com.rabbitmq.demo.rabbitmq.consumer

import org.springframework.amqp.rabbit.annotation.RabbitListener
import org.springframework.messaging.handler.annotation.Payload
import org.springframework.stereotype.Component

@Component
class RabbitConsumer {

    @RabbitListener(queues = ["sample-queue"])
    fun receiveMessage(@Payload message: String) {
        println("Receive message: $message")
    }
}