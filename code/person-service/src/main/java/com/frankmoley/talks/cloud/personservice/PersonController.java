package com.frankmoley.talks.cloud.personservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/people")
public class PersonController {

    private final PersonRepository repository;
    private static final Logger LOGGER = LoggerFactory.getLogger(PersonController.class);

    @Autowired
    public PersonController(PersonRepository repository){
        super();
        this.repository = repository;
    }

    @GetMapping
    public Iterable<Person> getAll(){
        LOGGER.info("Call hit");
        return this.repository.findAll();
    }


}
