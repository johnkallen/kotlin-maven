package com.example.kotlinmavenspring

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinMavenSpringApplication

fun main(args: Array<String>) {
	runApplication<KotlinMavenSpringApplication>(*args)
}
