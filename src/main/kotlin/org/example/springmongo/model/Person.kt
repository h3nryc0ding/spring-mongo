package org.example.springmongo.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.util.UUID

@Document
data class Person(
    @Id
    val id: UUID,
    val name: String,
    val age: Int
)
