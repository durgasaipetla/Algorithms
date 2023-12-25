package com.kodnest.constructors;

public class Laptop {
String brand;
String color;
int cost;
	
	public Laptop(String string, String string2, int i) {
		brand=string;
		color=string2;
		cost=i;
}

	public void doOperation() {
		System.out.println(brand+" " +color +" color laptop which cost of "+cost+" is working...");
	}

}
