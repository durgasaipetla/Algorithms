package ProgrammingDay;

import java.util.Scanner;

public class leapyear {
public static void main(String[] args) {
	Scanner scan =new Scanner(System.in);
	System.out.println("enter a year to check leap year or not");
	int year= scan.nextInt();
	if(year%4==0 &&(year%100!=0 || year%400==0)) {
		System.out.println("year is leap year");
	}
	else {
		System.out.println("Not leap year");
	}
}
}
