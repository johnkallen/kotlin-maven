package com.example.kotlinmavenspring.service

import com.example.kotlinmavenspring.data.Message
import com.example.kotlinmavenspring.repository.MessageRepository
import org.springframework.stereotype.Service

@Service
class MessageService(val db: MessageRepository) {
    fun findMessages(): List<Message> = db.findMessages()

    fun post(message: Message){
        db.save(message)
    }

    fun delete(id : String){
        db.deleteById(id)
    }
}