package com.kodnest.training.LoopingConstructs;
import java.util.Scanner;

public class DecimalToBinary {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number to find its binary code");
	int num= sc.nextInt();
	String bc =new String();
	while(num>1)
	{
		int rem=num%2;
		bc = String.valueOf(rem)+bc;
	    num= num/2;
		}
	bc = String.valueOf(num)+bc;
	System.out.println(bc);

}
}
