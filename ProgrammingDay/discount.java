package ProgrammingDay;

import java.util.Scanner;

public class discount {

	public static void main(String[] args) {
	Scanner scan= new Scanner(System.in);
	System.out.println("Enter the purchase");
	int purchase$ = scan.nextInt();
	if (purchase$>100)
		System.out.println("Discount Applicable");
	scan.close();
	}

}
