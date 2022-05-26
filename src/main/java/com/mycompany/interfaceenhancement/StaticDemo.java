package com.mycompany.interfaceenhancement;

public interface StaticDemo {
  //Static method dont get available in implements classes
	public static void show() {
		System.out.println("stati method 1");
	}
	public static void show2() {
		System.out.println("static method 2");
		
	}
}
