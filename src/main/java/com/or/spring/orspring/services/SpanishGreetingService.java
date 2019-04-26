package com.or.spring.orspring.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("spanish")
public class SpanishGreetingService implements GreetingService{

    @Override
    public String sayHello(String name) {
        return "Hola " + name;
    }
}
