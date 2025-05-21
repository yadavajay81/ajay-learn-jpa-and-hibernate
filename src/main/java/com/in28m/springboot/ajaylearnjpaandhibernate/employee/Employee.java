package com.in28m.springboot.ajaylearnjpaandhibernate.employee;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {

	@Id
	private long id;
	private String name;
	private String skill;
	
	

	public Employee() {
		
	}

	public Employee(long id, String name, String skill) {
		super();
		this.id = id;
		this.name = name;
		this.skill = skill;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", skill=" + skill + "]";
	}

}
