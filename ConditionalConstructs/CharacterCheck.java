package CharacterCheckUsingLoopingConstruct;
import java.util.Scanner;

public class CharacterCheck {
	public static void main(String[] args)

	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a character to check");
		char ch = sc.next().charAt(0);
		identifyCharacter(ch);
	}

	public static void identifyCharacter(char ch) {
		if (Character.isLowerCase(ch)) {
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == '0' || ch == 'u') {
				System.out.println("lower case vowel");
			} else {
				System.out.println("lower caser consonant");
			}
		}
		else if (Character.isUpperCase(ch)) {
			if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
				System.out.println("Upper case vowel");
			} else {
				System.out.println("Upper case consonant");
			}
		} else if (Character.isDigit(ch)) {
			System.out.println("u entered a digit");
		}

		else {
			System.out.println(" u entered a Special character");
		}
	}

	
}
