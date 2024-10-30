package com.rabbitmq.demo.controller

import org.springframework.amqp.core.Queue
import org.springframework.amqp.rabbit.core.RabbitTemplate
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class MessageController(
    private val queue: Queue,
    private val rabbitTemplate: RabbitTemplate
) {

    @PostMapping("/sendMessage")
    fun sendMessage(@RequestBody message: String) {
        rabbitTemplate.convertAndSend("sample-queue", message)
    }
}