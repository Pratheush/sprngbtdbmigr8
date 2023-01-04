package com.mylearning.springbootdatabasemigration;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mylearning.springbootdatabasemigration.model.Employee;
import com.mylearning.springbootdatabasemigration.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@SpringBootApplication
public class SpringBootDatabaseMigrationApplication {

    @Autowired
    EmployeeService employeeService;

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDatabaseMigrationApplication.class, args);
    }

    /*
   @Bean
    CommandLineRunner runner(EmployeeService employeeService) {
        return args -> {
            // read json and write to db
            ObjectMapper mapper = new ObjectMapper();
            TypeReference<List<Employee>> typeReference = new TypeReference<List<Employee>>(){};
            System.out.println("typeReference::::"+typeReference);
            InputStream inputStream = TypeReference.class.getResourceAsStream("/employee.json");
            System.out.println("inputStream ::::"+inputStream);
            try {
                List<Employee> employees = mapper.readValue(inputStream,typeReference);
                System.out.println("employees size():::"+employees.size());
                employeeService.save(employees);
                System.out.println("Employees Saved!");
            } catch (IOException e){
                System.out.println("Unable to save Employees: " + e.getMessage());
            }
        };
    }*/

}
