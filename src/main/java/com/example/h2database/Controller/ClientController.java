package com.example.h2database.Controller;

import com.example.h2database.model.Client;
import com.example.h2database.model.Employee;
import com.example.h2database.repository.ClientRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/clients")
public class ClientController {
    private ClientRepository repository;

    public ClientController(ClientRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public Iterable<Client> findAll(){
        return repository.findAll();
    }

    @PostMapping
    public void add(String firstname, String lastname, int age){
        repository.save(new Client(null,firstname,lastname,age));
    }
}
