package com.example.springstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.springstarter.entities.Student;

@SpringBootApplication
public class SpringStarterProject2Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(SpringStarterProject2Application.class, args);
		Student s=context.getBean(Student.class);
		//Student s=new Student();
		s.display();
	}

}