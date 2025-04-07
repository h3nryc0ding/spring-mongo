package org.example.springmongo.repository

import org.example.springmongo.model.Person
import org.springframework.data.mongodb.repository.ReactiveMongoRepository
import org.springframework.stereotype.Repository
import java.util.UUID

@Repository
interface PersonRepository : ReactiveMongoRepository<Person, UUID>
