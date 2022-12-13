package com.example.h2database.Controller;

import com.example.h2database.model.Client;
import com.example.h2database.model.Employee;
import com.example.h2database.repository.ClientRepository;
import com.example.h2database.repository.EmployeeRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/employees")
public class EmployeeController {
    private EmployeeRepository repository;

    public EmployeeController(EmployeeRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public Iterable<Employee> findAll(){
        return repository.findAll();
    }

    @GetMapping("{id}")
    public Employee getEmployee(@PathVariable("id") int id){
        System.out.println(id + " : here");
        return repository.findById(id).get();
    }

    @PostMapping("create")
    public Employee createNewEmployee(@RequestBody Employee newEmployee) {
        repository.save(newEmployee);
        return newEmployee;
    }

//    @PutMapping("{firstname}/{lastname}/{position}/{age}")
//    public void add(@PathVariable String firstname,@PathVariable String lastname,@PathVariable String position,@PathVariable int age){
//        repository.save(new Employee(null,firstname,lastname,position,age));
//    }
}
