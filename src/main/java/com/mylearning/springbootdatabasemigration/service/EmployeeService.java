package com.mylearning.springbootdatabasemigration.service;

import com.mylearning.springbootdatabasemigration.model.Employee;
import com.mylearning.springbootdatabasemigration.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;
    public  Iterable<Employee> save(List<Employee> employees) {

        return employeeRepository.saveAll(employees);
    }

    public Iterable<Employee> list() {
        Iterable<Employee> elist= employeeRepository.findAll();
        System.out.println(((List<Employee>) elist).size());
        //return employeeRepository.findAll();
        return elist;
    }

}
