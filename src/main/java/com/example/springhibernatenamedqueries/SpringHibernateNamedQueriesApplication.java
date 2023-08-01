package com.example.springhibernatenamedqueries;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringHibernateNamedQueriesApplication implements CommandLineRunner {

    private final NamedQueriesTestService service;

    public SpringHibernateNamedQueriesApplication(NamedQueriesTestService service) {
        this.service = service;
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringHibernateNamedQueriesApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        service.nestedJakartaNamedQueriesTest();
        service.repeatedJakartaNamedQueriesTest();
        service.nestedHibernateNamedQueriesTest();
        service.repeatedHibernateNamedQueriesTest();
    }
}
