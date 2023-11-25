package com.kodnest.training.loops;
import java.util.Scanner;
public class For {

	public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
	int pagenumber =100;
	boolean bored=true;
	int i=1;
	do {
	System.out.println("kodman read page "+i);
	System.out.println("Do u want to continue");
	 bored= sc.nextBoolean();
	i++;
	}while (bored);
	System.out.println("kodman get bored");
	}
}
