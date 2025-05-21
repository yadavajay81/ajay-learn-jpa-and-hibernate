package com.in28m.springboot.ajaylearnjpaandhibernate.course.springdatajpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.in28m.springboot.ajaylearnjpaandhibernate.course.Course;

public interface CourseSpringDataJpaRepository extends JpaRepository<Course, Long> {
	
	List<Course> findByAuthor(String author);

}
