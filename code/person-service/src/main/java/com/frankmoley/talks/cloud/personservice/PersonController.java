package com.frankmoley.talks.cloud.personservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/people")
public class PersonController {

    private final PersonRepository repository;

    @Autowired
    public PersonController(PersonRepository repository){
        super();
        this.repository = repository;
    }

    @GetMapping
    public Iterable<Person> getAll(){
        return this.repository.findAll();
    }


}
