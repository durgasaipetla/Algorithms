package Factorial;

import java.util.Scanner;

public class FactorialNumber {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number to check the factorial");
	int n =sc.nextInt();
	int fact =1;
	for(int i = n; i>=1; i--) {
		fact = i*fact;
	}
	System.out.println("The factorial of n is: "+fact);
}
}
