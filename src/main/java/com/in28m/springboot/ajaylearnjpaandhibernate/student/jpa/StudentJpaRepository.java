package com.in28m.springboot.ajaylearnjpaandhibernate.student.jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.in28m.springboot.ajaylearnjpaandhibernate.student.Student;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class StudentJpaRepository {
	
	@Autowired
	private EntityManager entityManager;
	
	public void insert(Student student) {
		entityManager.merge(student);
		
	}
	
	public Student getStudentById(long id) {
		return entityManager.find(Student.class, id);
		
	}
	/*
	public List<Student> getAllStudent() {
		
		TypedQuery<Student> query = entityManager.createNamedQuery("getAllStudentQuery", Student.class);
	    return query.getResultList();
		
	}
	*/
	
	
	public void delete(long id) {
		
		Student student = entityManager.find(Student.class, id);
		entityManager.remove(student);
		
	}

}
