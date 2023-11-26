package com.kodnest.training.LoopingConstructs;
import java.util.Scanner;

public class gradecheck {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
System.out.println("enter the grade of student");
int n = scan.nextInt();
checkgrade(n);
	}

	public static void checkgrade(int n) {
		if (n>50) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
	}

}
