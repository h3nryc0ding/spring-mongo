package org.example.springmongo.controller

import org.example.springmongo.model.Person
import org.example.springmongo.repository.PersonRepository
import org.springframework.web.bind.annotation.*
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono
import java.util.*

@RestController
@RequestMapping("/people")
class PersonController(
    private val repository: PersonRepository
) {
    @GetMapping
    fun getAll(): Flux<Person> = repository.findAll()

    @PostMapping
    fun create(@RequestBody person: Person): Mono<Person> = repository.save(person)

    @GetMapping("/{id}")
    fun getById(@PathVariable id: UUID): Mono<Person> = repository.findById(id)

    @DeleteMapping("/{id}")
    fun delete(@PathVariable id: UUID): Mono<Void> = repository.deleteById(id)
}
