package com.example.springstarter.entities;

import org.springframework.stereotype.Component;

@Component
public class Student 
{
	private int id;
	private String name;
	
	public Student() {
		super();
		System.out.println("B1-4 Students");
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void display()
	{
		System.out.println("Student class");
	}

}