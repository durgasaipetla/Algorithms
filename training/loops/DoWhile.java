package com.kodnest.training.loops;

import java.util.*;

public class DoWhile {

	public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	int pagenumber =100;
	boolean b= true;
	int i=1;
	do {
		System.out.println("Kodman is reading page no "+ i);
	     i++;
	    System.out.println("Do u want to continue");
	    b=sc.nextBoolean(); 
	}while (b);
      

	}

}
