package com.example.employeepayrollapp.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public class EmployeePayrollDTO {

    @NotEmpty(message = "Name cannot be empty")
    private String name;

    @Min(value = 500, message = "Salary should be at least 500")
    @NotNull(message = "Salary cannot be null")
    private Long salary;

    public String getName() {
        return name;
    }

    public Long getSalary() {
        return salary;
    }
}