package com.example.kotlinmavenspring.controllers

import com.example.kotlinmavenspring.data.Message
import com.example.kotlinmavenspring.service.MessageService
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class MessageController(val service: MessageService) {
    @GetMapping("/test")
    fun test(): List<Message> = listOf(
        Message("1", "Hello!"),
        Message("2", "Bonjour!"),
        Message("3", "Privet!"),
    )
    @GetMapping
    fun index(): List<Message> = service.findMessages()

    @PostMapping
    fun post(@RequestBody message: Message) {
        service.post(message)
    }

    @DeleteMapping("/{id}")
    fun delete(@PathVariable("id") id : String) {
        service.delete(id)
    }
}