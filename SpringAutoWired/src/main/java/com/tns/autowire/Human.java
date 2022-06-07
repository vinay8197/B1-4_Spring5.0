package com.tns.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human
{
	private Heart h;
	
	public Human()
	{
		
		this.h = h;
	}
	
	public Human(Heart h) {
		super();
		this.h = h;
	}
	@Autowired
	@Qualifier("o")
	public void setH(Heart h) {
		this.h = h;
	}

	public void display()
	{
		h.pump();
		System.out.println("The name of Animal is "+h.getNameOfAnimal()+" and No.of Heart is "+h.getNoOfHeart());
	}

}