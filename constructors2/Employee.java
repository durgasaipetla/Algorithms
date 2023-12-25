package com.kodnest.constructors2;

public class Employee {
	int id;
	String name;
	int salary;
public Employee(int id, String name, int salary) 
{
	this.id=id;
	this.name=name;
	this.salary=salary;
}
public void work() {
	System.out.println("Employee "+name+ " is working");
}

}
