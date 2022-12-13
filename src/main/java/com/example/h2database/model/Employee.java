package com.example.h2database.model;

import org.springframework.data.annotation.Id;

public record Employee(@Id Integer id, String firstname, String lastname, String position, int age) {

}

