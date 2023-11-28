package ProgrammingDay;

import java.util.Scanner;

public class SwapNumbers {

	public static void main(String[] args) {
    int a= 2;
    int b=3;
    swapnumbers(a,b);
	}


	public static void swapnumbers(int a, int b) {
	int c;
    c= a;
    a=b;
    b=c;
    System.out.println("a value is "+a);
    System.out.println("b value is "+b);
    }

	}

