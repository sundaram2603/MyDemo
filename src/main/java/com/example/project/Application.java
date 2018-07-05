package com.example.project;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.department", "com.example.topic", "com.example.employees"})
@EntityScan(basePackages = {"com.example.department", "com.example.topic", "com.example.employees"})
@EnableJpaRepositories(basePackages = {"com.example.department", "com.example.topic", "com.example.employees"})
public class Application {
    public static void main(String[] args) {
        new SpringApplicationBuilder(Application.class)
                .profiles("prod")
                .run(args);
    }
}
