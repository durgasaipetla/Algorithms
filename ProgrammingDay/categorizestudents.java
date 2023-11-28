package ProgrammingDay;

import java.util.Scanner;

public class categorizestudents {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the marks of students");
		int marks = scan.nextInt();
		if (marks >= 90 && marks <= 100) 
		{
			System.out.println("A Grade");
		} 
		else if (marks >= 80 && marks <= 89) 
		{
			System.out.println("B Grade");
		} 
		else if (marks >= 70 && marks <= 79) 
		{
			System.out.println("C Grade");
		}
		else if (marks >= 60 && marks <= 69) 
		{
			System.out.println("D Grade");
		} 
		else
		{
			System.out.println("Fail");
		}
		scan.close();
	}

}
