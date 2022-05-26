package com.mycompany.interfaceenhancement;

public interface Vehicle7 {
	
	default void show() {
		System.out.println("adde new feature 1");
	}
	default void showNew() {
		System.out.println("adde new feature 2");
	}
	void getDetails();  //public abstract
	String COLOR = "RED"; //public static final
	Double milege();  //public abstract

}
