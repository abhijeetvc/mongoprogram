package com.mongodb.mongoprogram.controller;

import com.mongodb.mongoprogram.domain.Employee;
import com.mongodb.mongoprogram.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @PostMapping(value="/save")
    public String saveData(@RequestBody Employee employee){
        employeeRepository.save(employee);
        return "Employee Saved";
    }

    @GetMapping(value="/getemplist")
    public List<Employee> getEmpList(){
        return employeeRepository.findAll();
    }

    @GetMapping(value="/getemp/{id}")
    public Optional<Employee> getEmpList(@PathVariable String id){
        return employeeRepository.findById(id);
    }
}
