package com.denizturkmen.crudexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class CrudExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(CrudExampleApplication.class, args);
    }

}
