package com.in28m.springboot.ajaylearnjpaandhibernate.student.jdbc;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.in28m.springboot.ajaylearnjpaandhibernate.student.Student;

@Repository
public class StudentJdbcRepository {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private String INSERT_QUERY = 
			"""
			insert into student (id, name, sclass)
			values(?, ?, ?);
			""";
	
	private String DELETE_QUERY = 
			"""
			delete from student where id = ?;
			""";
	
	private String SELECT_QUERY = 
			"""
			select * from student where id = ?;
			""";
	
	private String SELECT_ALL_QUERY = 
			"""
			select * from student;
			""";
	
	public void insert(Student student) {
		jdbcTemplate.update(INSERT_QUERY,student.getId(), student.getName(), student.getSclass());
	}
	
	public void delete(long id) {
		jdbcTemplate.update(DELETE_QUERY, id);
	}
	
	public Student getStudentById(long id) {
		return jdbcTemplate.queryForObject(SELECT_QUERY, new BeanPropertyRowMapper<>(Student.class), id);
	}
	
	
	public List<Student> getAllStudent() {
		return jdbcTemplate.query(SELECT_ALL_QUERY, new BeanPropertyRowMapper<>(Student.class));
		
		
	}

}
