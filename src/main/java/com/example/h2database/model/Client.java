package com.example.h2database.model;

import org.springframework.data.annotation.Id;

public record Client(@Id Integer id, String firstname, String lastname, int age) {
}
