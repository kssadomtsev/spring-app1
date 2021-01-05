package ru.onyxone;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class ClassicalMusic implements Music {

    @PostConstruct
    public void doInit(){
        System.out.println("Init...");
    }

    @PreDestroy
    public void doDestroy(){
        System.out.println("Destroy...");
    }

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
