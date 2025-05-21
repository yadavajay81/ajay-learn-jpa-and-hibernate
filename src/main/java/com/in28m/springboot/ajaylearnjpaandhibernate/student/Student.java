package com.in28m.springboot.ajaylearnjpaandhibernate.student;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQuery;


@Entity
//@NamedQuery(name="getAllStudentQuery", query="SELECT * FROM STUDENT")
public class Student {

	@Id
	private long id;
	private String name;
	private String sclass;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(long id, String name, String sclass) {
		super();
		this.id = id;
		this.name = name;
		this.sclass = sclass;
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

	public String getSclass() {
		return sclass;
	}

	public void setSclass(String sclass) {
		this.sclass = sclass;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", sclass=" + sclass + "]";
	}

}
