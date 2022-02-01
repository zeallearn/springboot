package com.test.springboot.springboot;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import com.test.springboot.springboot.entities.Employee;
import com.test.springboot.springboot.repos.EmployeeRepository;
import com.test.springboot.springboot.service.Service;

@RunWith(SpringRunner.class)
@SpringBootTest
class SpringbootApplicationTests {
	@Autowired
	ApplicationContext context;
	/*@Test
	void contextLoads() {
		Service svc = context.getBean(Service.class);
		svc.save();
	}*/
	@Test
	public void saveDetails() {
		EmployeeRepository repository = context.getBean(EmployeeRepository.class);
		Employee emp = new Employee();
		emp.setId(4);
		emp.setFname("qwer");
		emp.setLname("asdf");
		//repository.save(emp);
		
		//Optional<Employee> result = repository.findById(4);
		
		emp.setLname("tyui");
		repository.save(emp);
		repository.findAll().forEach(e->{System.out.println(e.getLname());});
		
		
		
	} 

}
