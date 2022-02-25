package org.example;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class ClassicalMusic implements Music{

    @PostConstruct
    public void doMyInit(){
        System.out.println("INIT");
    }

    @PreDestroy
    public void doMyDestroy(){
        System.out.println("Destroy");
    }

    @Override
    public String getSong() {
        return "I Dovregubbens Hall";
    }
}
