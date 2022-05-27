package com.mycompany.functionalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.management.RuntimeErrorException;

public class EmployeeOptionalMain {

	public static void main(String[] args) {

		Employee[] empArr = {

				new Employee("John", 5678.90, 23), 
				new Employee("Peter", 1212.33, 24),
				new Employee("Ram", 2324.33, 26),
				new Employee("Rohan", 3344.33, 27), 
				new Employee("Rohit", 3344.33, 29), };
		try {

		List<Employee> empList = Arrays.asList(empArr);
		
		Optional<Employee> optEmp = empList.stream().filter(emp->emp.getSalary() > 2000.00)
		.findFirst();

		if(optEmp.isPresent()) {
		System.out.println("Employee found with below details ");	
		Employee foundEmp = optEmp.get();
		System.out.println(foundEmp.getEmpName()+ " "+foundEmp.getSalary());
	
		
		}else {
			System.out.println("No matching record found");
		}
		
		String name = null;
		Optional<String>optName = name !=null? Optional.of(name) : Optional.empty();
		
		if(optName.isPresent()) {
			System.out.println("Name is "+optName.get());
			
		}else {
			System.out.println("No name found");
		}
		
		optEmp.ifPresent(e->System.out.println(e.getEmpName()));
		
		Employee defaultEmp = optEmp.orElse(new Employee("Default", 0000.00, 0));
		
		optEmp.orElseThrow(()->new RuntimeException("Employee not found"));
	}catch(Exception e) {
		e.printStackTrace();
		System.out.println(e.getMessage());
	}
	}
}
