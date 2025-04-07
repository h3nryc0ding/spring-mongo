package org.example.springmongo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories

@SpringBootApplication
@EnableReactiveMongoRepositories
class SpringMongoApplication

fun main(args: Array<String>) {
    runApplication<SpringMongoApplication>(*args)
}
