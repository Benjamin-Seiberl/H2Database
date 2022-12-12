package com.example.h2database;

import com.example.h2database.model.Client;
import com.example.h2database.repository.ClientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class H2DatabaseApplication {

    public static void main(String[] args) {
        SpringApplication.run(H2DatabaseApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(ClientRepository repository){
        return args -> {
            repository.save(new Client(null,"Maja", "Nikolic", 20));
        };
    }
}
