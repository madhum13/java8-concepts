package com.mycompany.functionalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeMain {

	public static void main(String[] args) {

		Employee[] empArr = {

				new Employee("John", 5678.90, 23), 
				new Employee("Peter", 1212.33, 24),
				new Employee("Ram", 2324.33, 26),
				new Employee("Rohan", 3344.33, 27), 
				new Employee("Rohit", 3344.33, 29), };

		List<Employee> empList = Arrays.asList(empArr);

		List<String> empNames = empList.parallelStream()
				.filter((emp) -> {
			return emp.getSalary() > 2000.00;
		}).filter((emp) -> {
			return emp.getAge() > 24;
		})
				.map(emp->emp.getEmpName())
				.collect(Collectors.toList());
		System.out.println(empNames);

		// for(Employee e:empList) {
		// System.out.println("Emp name :"+e.getEmpName()+"Emp salary:"+e.getSalary());
		// takes a consumer type of lamda function [they dont return anything]
		empList.forEach(e -> System.out.println("Employee name :" + e.getEmpName() + " Emp salary:" + e.getSalary()));
		System.out.println("**********After Removing*********");
		// remove an employee from list whose name starts with Ro
		empList.removeIf(e -> e.getEmpName().startsWith("Ro"));
		empList.forEach(e -> System.out.println("Employee name :" + e.getEmpName() + " Emp salary:" + e.getSalary()));

	}
}
