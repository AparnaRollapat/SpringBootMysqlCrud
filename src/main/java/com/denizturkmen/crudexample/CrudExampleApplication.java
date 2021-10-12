package com.denizturkmen.crudexample;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Person API", version = "2.0", description = "Person Information"))
public class CrudExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(CrudExampleApplication.class, args);
    }

}
