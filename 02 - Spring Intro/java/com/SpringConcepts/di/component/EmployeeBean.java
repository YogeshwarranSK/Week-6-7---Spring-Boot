package com.SpringConcepts.di.component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeBean {
    private static final Logger logger = LoggerFactory.getLogger(EmployeeBean.class);

    private int id;
    private String name;

    @Autowired
    private DepartmentBean department;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public DepartmentBean getDepartment() {
        return department;
    }
    public void setDepartment(DepartmentBean department) {
        this.department = department;
    }

    public void showEmployeeDetails() {
        logger.info("Employee ID: {}", id);
        logger.info("Employee Name: {}", name);
        logger.info("Department: {}", department.getDeptName());
    }
}