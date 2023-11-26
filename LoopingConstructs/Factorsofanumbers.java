package com.kodnest.training.LoopingConstructs;
import java.util.Scanner;

public class Factorsofanumbers {

	public static void main(String[] args) {
	Scanner scan= new Scanner(System.in);
	System.out.println("enter the number to find its factors");
	int n= scan.nextInt();
	for(int i=1; i<=n;i++) {
		if(n%i==0) {
			System.out.println("factors are "+i);
		}
		scan.close();
	}
	}

}
