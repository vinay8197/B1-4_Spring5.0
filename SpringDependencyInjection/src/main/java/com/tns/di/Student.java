package com.tns.di;

public class Student
{
	
	private String StudentName;
	private int id;
	//constructor injection
	public Student(String studentName,int id ) {
		super();
		
		StudentName = studentName;
		this.id = id;
	}


	
	public void display()
	{
		System.out.println("Name of the student is: "+StudentName +" and ID is: "+id );
	}

}