package ProgrammingDay;

import java.util.Scanner;

public class Adult {

	public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a number to check whether adult");
    int n = scan.nextInt();
    if (n>21) {
    	System.out.println("Adult");
    }
	}

}
