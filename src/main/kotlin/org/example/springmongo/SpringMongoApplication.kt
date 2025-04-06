package org.example.springmongo

import com.mongodb.client.MongoClient
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.stereotype.Component

@Component
class MongoDetails(
    mongoClient : MongoClient,
) {
    init {
        println("MongoCluster: ${mongoClient.clusterDescription.clusterSettings}")
    }
}

@SpringBootApplication
class SpringMongoApplication

fun main(args: Array<String>) {
    runApplication<SpringMongoApplication>(*args)
}
