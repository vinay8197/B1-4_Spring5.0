package com.tns.di1;

public class AnotherStudent 
{
	//Dependency in the form of objects
			Cheat c;
			//setters method for DI
			public void setC(Cheat c) {
				this.c = c;
			}

			public void cheating()
			{
				c.mathCheat();
			}

}