package com.kodnest.constructors2;

public class EmployeeApp {
public static void main(String[] args) {
	Employee emp= new Employee(1,"Bhanu",35000);
	
	System.out.println(emp.id);
	System.out.println(emp.name);
	System.out.println(emp.salary);
	emp.work();
}
}
