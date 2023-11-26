package com.kodnest.JumpingControlConstructs;
import java.util.*;
public class Switch {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter + or - or * or / to know about the operator");
	char opt = sc.next().charAt(0);
	switch(opt) {
	case '+' :
		System.out.println("Addition operator");
	break;
	case '-' :
		System.out.println("Subtraction operator");
	break;
	case '*' :
		System.out.println("Multiplication operator");
	break;
	case '/' :
		System.out.println("Division operator");
	break;
	default :
		System.out.println("Ediot see the msg carefully");
	break;
	}
	sc.close();
	}

}
