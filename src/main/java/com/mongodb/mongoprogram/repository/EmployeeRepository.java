package com.mongodb.mongoprogram.repository;

import com.mongodb.mongoprogram.domain.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmployeeRepository extends MongoRepository<Employee,String> {
}
