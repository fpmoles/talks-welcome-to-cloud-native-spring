package com.frankmoley.talks.cloud.businessservice;

import org.springframework.stereotype.Component;

import java.util.Collections;

@Component
public class PersonServiceFallbackImpl implements PersonServiceClient{

    @Override
    public Iterable<Person> getAll() {
        Person person = new Person();
        person.setEmailAddress("frankmoley@gmail.com");
        person.setFirstName("Frank");
        person.setLastName("Moley");
        return Collections.singletonList(person);
    }
}
