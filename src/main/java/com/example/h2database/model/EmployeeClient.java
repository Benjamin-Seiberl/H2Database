package com.example.h2database.model;

import org.springframework.data.annotation.Id;

public record EmployeeClient(int employeeId, int clientId) {

    public EmployeeClient(int employeeId, int clientId) {
        this.employeeId = employeeId;
        this.clientId = clientId;
    }
}

