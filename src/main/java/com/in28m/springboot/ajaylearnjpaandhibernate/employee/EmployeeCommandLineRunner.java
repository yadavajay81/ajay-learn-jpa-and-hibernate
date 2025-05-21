package com.in28m.springboot.ajaylearnjpaandhibernate.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class EmployeeCommandLineRunner implements CommandLineRunner {

	@Autowired
	private EmployeeSpringDataJpaRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("Employee start--");
		repository.save(new Employee(1, "Ajay", "PHP"));
		repository.save(new Employee(2, "Ajay", "Java"));
		repository.save(new Employee(3, "Ajay", "Spring Boot"));
		repository.save(new Employee(4, "Ajay", "JFrog"));
		
		repository.deleteById(1l);
		
		System.out.println(repository.findById(2l));
		System.out.println(repository.findAll());
		System.out.println(repository.findBySkill("Java"));
		
		System.out.println(repository.count());
		
		System.out.println("Employee End---");
		
	}

}
