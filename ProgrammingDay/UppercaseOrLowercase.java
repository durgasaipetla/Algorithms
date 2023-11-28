package ProgrammingDay;
import java.util.Scanner;

public class UppercaseOrLowercase {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a character ");
		char Ch = scan.next().charAt(0);
		if ((Character.isLowerCase(Ch))) {
			if (UppercaseOrLowercaseApp.lowervowel(Ch)) {
				System.out.println("The entered character " + Ch + " is Lower vowel");
			} else {
				System.out.println("the character is lower consonant");
			}
		} else if ((Character.isUpperCase(Ch))) {
			if (UppercaseOrLowercaseApp.uppervowel(Ch)) {
				System.out.println("The entered character " + Ch + " is Upper vowel");
			}

			else {
				System.out.println("the character is upper consonant");
			}

		}

		else if (Character.isDigit(Ch)) {
			System.out.println("It is number");
		} else {
			System.out.println("It is a special character");
		}
	}

	
}

