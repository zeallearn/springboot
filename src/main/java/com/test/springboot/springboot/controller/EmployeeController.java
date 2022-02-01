package com.test.springboot.springboot.controller;

import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.springboot.springboot.entities.Employee;
import com.test.springboot.springboot.repos.EmployeeRepository;

@RestController
@RequestMapping("/Employee")
public class EmployeeController {
	EmployeeRepository repo;
	
	@GetMapping 
	public Iterable<Employee> getEmployees() {
		
		return repo.findAll();
		
	}
	
	@PostMapping
	public Employee create(@RequestBody Employee employee) {
		
		return repo.save(employee);
		
	}
	
	@PutMapping
	public Employee update(@RequestBody Employee employee) {
		
		return repo.save(employee);
		
	}
	
	@PutMapping
	public Optional<Employee> getEmployee(Integer id) {
		
		return repo.findById(id);
		
	}
}
