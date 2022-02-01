package com.test.springboot.springboot.repos;

import org.springframework.data.repository.CrudRepository;

import com.test.springboot.springboot.entities.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

}
