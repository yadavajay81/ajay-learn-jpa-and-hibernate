package com.in28m.springboot.ajaylearnjpaandhibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.in28m.springboot.ajaylearnjpaandhibernate.course.jdbc.CourseJdbcRepository;
import com.in28m.springboot.ajaylearnjpaandhibernate.course.jpa.CourseJpaRepository;
import com.in28m.springboot.ajaylearnjpaandhibernate.course.springdatajpa.CourseSpringDataJpaRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

	
	@Autowired
	private CourseJdbcRepository jdbcrepository;
	
	
	@Autowired
	private CourseJpaRepository jparepository;
	
	@Autowired
	private CourseSpringDataJpaRepository springJpaRepository;
	
	@Override
	public void run(String... args) throws Exception {
		jparepository.insert(new Course(1, "Azure", "Ajay Yadav"));
		jdbcrepository.insert(new Course(2, "Azure", "Ajay Yadav"));
		jparepository.insert(new Course(3, "Azure", "Ajay Yadav"));
		
		jparepository.deleteById(1);
		
		System.out.println(jdbcrepository.findById(2));
		System.out.println(jparepository.findById(3));
		
		
		springJpaRepository.save(new Course(4, "Ajay Spring Data JPA", "Spring Data Jpa"));
		springJpaRepository.save(new Course(5, "Ajay Spring Data JPA", "Spring Data Jpa"));
		springJpaRepository.save(new Course(6, "Ajay Spring Data JPA", "Spring Data Jpa"));
		springJpaRepository.save(new Course(7, "Ajay Spring Data JPA", "Spring Data Jpa"));
		
		springJpaRepository.deleteById(4l);
		System.out.println(springJpaRepository.findById(5l));
		System.out.println(springJpaRepository.findAll());
		
		System.out.println("================================");
		System.out.println(springJpaRepository.findByAuthor("Ajay Yadav"));
		System.out.println("================================");
	}

}
