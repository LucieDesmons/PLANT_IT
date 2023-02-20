package com.plantit.bll;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@AutoConfigurationPackage
@EntityScan({"com.plantit.dal.entities"})
@EnableJpaRepositories({"com.plantit.dal.repositories"})
@ComponentScan(basePackages = {"com.plantit.dal"})
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
