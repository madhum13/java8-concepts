package com.mycompany.functionalinterface;

import java.io.ObjectInputStream.GetField;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeMain {

	public static void main(String[] args) {

		Employee[] empArr = {

				new Employee("John", 5678.90), 
				new Employee("Peter", 1212.33),
				new Employee("Ram", 2324.33),
				new Employee("Rohan", 3344.33),
				new Employee("Rohit", 3344.33),

		};
		List<Employee> empList = Arrays.asList(empArr);

		empList.parallelStream().filter((emp) -> {
			return emp.getSalary() > 2000.0;
		}).collect(Collectors.toList());

		// for(Employee e:empList) {
		// System.out.println("Emp name :"+e.getEmpName()+"Emp salary:"+e.getSalary());
		// takes a consumer type of lamda function [they dont return anything]
		empList.forEach(e -> System.out.println("Employee name :" + e.getEmpName() + "Emp salary:" + e.getSalary()));
		System.out.println("**********After Removing*********");
		// remove an employee from list whose name starts with Ro
		empList.removeIf(e -> e.getEmpName().startsWith("Ro"));
		empList.forEach(e -> System.out.println("Employee name :" + e.getEmpName() + "Emp salary:" + e.getSalary()));

	}
}
