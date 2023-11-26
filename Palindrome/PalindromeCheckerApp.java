package Palindrome;
import java.util.Scanner;

public class PalindromeCheckerApp {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Number to Check It Is Palindrome or Not...");
		int n= scan.nextInt();
		PalindromeChecker pc = new PalindromeChecker();
		int  rev=pc.reverseNumber(n);
		System.out.println(rev);
		if (rev==n) {
			System.out.println("The Entered  number "+n+" is Palindrome");
		}
		else {
			System.out.println("The Entered number n is not Palindrome");
		}
	}

}
