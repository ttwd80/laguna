package com.github.ttwd80.laguna

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class LagunaApplication

fun main(args: Array<String>) {
	runApplication<LagunaApplication>(*args)
}
