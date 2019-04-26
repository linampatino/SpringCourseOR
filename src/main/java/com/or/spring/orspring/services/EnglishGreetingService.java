package com.or.spring.orspring.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("english")
public class EnglishGreetingService implements GreetingService {
    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }
}
