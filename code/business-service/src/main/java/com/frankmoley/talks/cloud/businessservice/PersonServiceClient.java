package com.frankmoley.talks.cloud.businessservice;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value="PERSON-SERVICE", fallback = PersonServiceFallbackImpl.class)
public interface PersonServiceClient {
    @GetMapping("/people")
    Iterable<Person> getAll();
}
