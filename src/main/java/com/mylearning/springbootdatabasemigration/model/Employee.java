package com.mylearning.springbootdatabasemigration.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "employees")
@Data
public class Employee {

    @Id
    private String employeeId;
    private String firstName;
    private String lastName;
    private String email;
    private String gender;
    private Boolean newJoiner;
    private Boolean learningPending;
    private BigDecimal salary;
    private Integer rating;
}

/*
 "employeeId": "59-385-1088",
         "firstName": "Zacharias",
         "lastName": "Schwerin",
         "email": "zschwerin0@altervista.org",
         "gender": "Male",
         "newJoiner": "TRUE",
         "learningPending": "FALSE",
         "salary": 101146,
         "rating": 0
         },*/
