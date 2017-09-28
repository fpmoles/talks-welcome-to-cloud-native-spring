package com.frankmoley.talks.cloud.businessservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RootController {

    private final PersonServiceClient client;

    @Autowired
    public RootController(PersonServiceClient client){
        super();
        this.client = client;
    }

    @GetMapping("/")
    public Iterable<Person> getAll(){
        return this.client.getAll();
    }
}
