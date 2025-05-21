package com.in28m.springboot.ajaylearnjpaandhibernate.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.in28m.springboot.ajaylearnjpaandhibernate.student.jdbc.StudentJdbcRepository;
import com.in28m.springboot.ajaylearnjpaandhibernate.student.jpa.StudentJpaRepository;

@Component
public class StudentCommandLineRunner implements CommandLineRunner {
	
	@Autowired
	private StudentJdbcRepository jdbcRepository;
	
	@Autowired
	private StudentJpaRepository jpaRepository;

	@Override
	public void run(String... args) throws Exception {
		jpaRepository.insert(new Student(1, "AjayJPA", "Mca"));
		jpaRepository.insert(new Student(2, "Ajay2JPA", "Mca2"));
		jpaRepository.insert(new Student(3, "Ajay3JPA", "Mca3"));
		jpaRepository.insert(new Student(4, "Ajay4JPA", "Mca4"));
		
		jdbcRepository.insert(new Student(5, "AjayJDBC", "Mca5"));
		jdbcRepository.insert(new Student(6, "Ajay2JDBC", "Mca6"));
		jdbcRepository.insert(new Student(7, "Ajay3JDBC", "Mca7"));
		jdbcRepository.insert(new Student(8, "Ajay4JDBC", "Mca8"));
		
		jdbcRepository.delete(2);
		
		jpaRepository.delete(5);
		
		System.out.println(jdbcRepository.getStudentById(1));
		System.out.println(jdbcRepository.getStudentById(3));
		System.out.println(jdbcRepository.getStudentById(4));
		
		
		System.out.println(jpaRepository.getStudentById(5));
		System.out.println(jpaRepository.getStudentById(6));
		System.out.println(jpaRepository.getStudentById(7));
		
		
		System.out.println(jdbcRepository.getAllStudent());
		
		System.out.println(jdbcRepository.getAllStudent().get(0).getName());
		
		System.out.println("Fetch All student by JPA");
		//System.out.println(jpaRepository.getAllStudent());
		
	}

}
