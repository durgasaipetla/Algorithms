package com.kodnest.LoopingProblems;
import java.util.Scanner;
public class SwitchCase {

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter a day");
	int num =sc.nextInt();
	switch(num) {
	case 1:
		System.out.println("Sleep Sunday");
		break;
	case 2:
		System.out.println("Boring Monday");
		break;
	case 3:
		System.out.println("Trimming Tuesday");
		break;
	case 4:
		System.out.println("Washing Wednesday");
		break;
	case 5:
		System.out.println("Trimming Thursday");
		break;
	case 6:
		System.out.println("Fasting Friday");
		break;
	case 7:
		System.out.println("Chilling Saturday");
		break;
		default:
			System.out.println("please enter a valid week");
		
	}
	sc.close();
	}

}
