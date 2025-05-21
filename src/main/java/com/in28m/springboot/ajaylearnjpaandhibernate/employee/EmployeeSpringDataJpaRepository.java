package com.in28m.springboot.ajaylearnjpaandhibernate.employee;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeSpringDataJpaRepository extends JpaRepository<Employee, Long>{
	
	List<Employee> findBySkill(String skill);

}
