package com.example.h2database.model;

import org.springframework.data.annotation.Id;

public record Employee(@Id Integer id, String firstname, String lastname, String position, int age) {

    public Employee(Integer id, String firstname, String lastname, String position, int age) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.position = position;
        this.age = age;
    }
}

