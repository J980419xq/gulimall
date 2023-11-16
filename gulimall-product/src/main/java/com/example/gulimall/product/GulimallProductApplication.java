package com.example.gulimall.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class GulimallProductApplication {

    private final Environment environment;

    @Autowired
    public GulimallProductApplication(Environment environment) {
        this.environment = environment;
    }

    public void printConfiguration() {
        String propertyValue = environment.getProperty("a");
        System.out.println("a: " + propertyValue);
    }

    public static void main(String[] args) {
        SpringApplication.run(GulimallProductApplication.class, args);

    }

}
