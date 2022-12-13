package com.example.h2database.Controller;

import com.example.h2database.model.Employee;
import com.example.h2database.model.EmployeeClient;
import com.example.h2database.repository.EmployeeClientRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("api/businessRelations")
public class EmployeeClientController {
    private EmployeeClientRepository repository;


    public EmployeeClientController(EmployeeClientRepository repository) {
        this.repository = repository;
    }
//
//    @GetMapping
//    public Iterable<EmployeeClient> findAll(){
//        return repository.findAll();
//    }
    @GetMapping
    public String findAll(){
        return "Yeah";
    }

    @GetMapping("employee/{id}")
    public EmployeeClient getAllRelationsEmployee(@PathVariable int id){
        return repository.findById(id).get();
    }
}
