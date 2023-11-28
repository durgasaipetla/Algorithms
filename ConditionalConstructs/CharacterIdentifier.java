package CharacterCheckUsingLoopingConstruct;
import java.util.Scanner;

public class CharacterIdentifier {
	public static void main(String[] args) {
		System.out.println("enter a character ");
		Scanner scan = new Scanner ( System.in);
		char ch = scan.next().charAt(0);
		characterCheck(ch);
	}

public static void characterCheck(char ch) {
	if (Character.isDigit(ch)) {
		System.out.println("Entered character "+ch+" is digit");
	}
	else if (!Character.isLetter(ch)) {
		System.out.println("Entered character "+ch+" is Special character");
	}
	else {
		switch (Character.toLowerCase(ch)) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			if (Character.isLowerCase(ch)) {
			System.out.println("entered character "+ch+ "is lower case vowel");
		}
			else {
				System.out.println("entered character "+ch+" is upper case vowel");
			}
			break;
			default:
				if (Character.isLowerCase(ch)) {
					System.out.println("entered character is "+ch+" lower case consonant");
				}
				else {
					System.out.println("entered character is "+ch+" upper case consonant");
				}
	}
}}}