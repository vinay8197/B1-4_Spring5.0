package com.tns.springioc;

public class Airtel implements Sim
{
	

	public Airtel() {
		super();
		System.out.println("Airtel class Constructor");
	}

	public void calling() {
		System.out.println("Calling using Airtel sim");
		
	}

	public void data() {
		System.out.println("data using Airtel sim");
		
	}
	

}