package com.mylearning.springbootdatabasemigration.controller;

import com.mylearning.springbootdatabasemigration.model.Employee;
import com.mylearning.springbootdatabasemigration.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class EmployeeController {

    private final EmployeeService employeeService;

    @GetMapping("/elist")
    public Iterable<Employee> list() {

        return employeeService.list();
    }
}
