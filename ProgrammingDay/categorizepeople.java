package ProgrammingDay;

import java.util.Scanner;

public class categorizepeople {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter age to know the category");
		int age = scan.nextInt();
		if ( age>=0&& age<=12) 
		{
			System.out.println("Child");
		}
		else if ( age>=13&& age<=19) {
			System.out.println("Teen");
		}
		else if ( age>=20&& age<=59) {
			System.out.println("Adult");
		}
		else {
			System.out.println("Senior citizen");
		}
		scan.close();
	}

}
