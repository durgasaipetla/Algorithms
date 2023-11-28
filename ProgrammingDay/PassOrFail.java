package ProgrammingDay;
import java.util.Scanner;

public class PassOrFail {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the marks of a student");
		int marks = scan.nextInt();
		if (marks > 50) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
	}

}
