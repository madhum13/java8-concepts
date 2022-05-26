package com.mycompany.functionalinterface;

public class DummyMain {

	public static void main(String[] args) {

		Integer x1 = 3;
		Integer x2 = 13;
		
		IamFunctionalInterface var1 = ()->{
			System.out.println("Hello World");
			};
			
		var1.display();
		
		IamFunctionalInterface var2 = ()->{
			System.out.println("Bye Bye");
			};

	   var2.display();
	}
	

}
