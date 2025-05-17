package com.SpringConcepts.di;

import com.SpringConcepts.di.component.EmployeeBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyInjectionDemoApplication {
    public static final Logger logger = LoggerFactory.getLogger(DependencyInjectionDemoApplication.class);

    public static void main(String[] args) {
        logger.debug("Starting Dependency Injection Demo...");

        ApplicationContext context = SpringApplication.run(DependencyInjectionDemoApplication.class, args);

        logger.debug("*** Example Using @Autowired annotation on property ***");

        EmployeeBean employee = context.getBean(EmployeeBean.class);
        employee.setId(101);
        employee.setName("Spring Framework Guru");
        employee.showEmployeeDetails();
    }
}