package com.example.gulimall.product;

import org.apache.naming.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class GulimallProdctApplication {

    private final Environment environment;

    @Autowired
    public GulimallProdctApplication(Environment environment) {
        this.environment = environment;
    }

    public void printConfiguration() {
        String propertyValue = environment.getProperty("a");
        System.out.println("a: " + propertyValue);
    }

    public static void main(String[] args) {
        SpringApplication.run(GulimallProdctApplication.class, args);

    }

}
