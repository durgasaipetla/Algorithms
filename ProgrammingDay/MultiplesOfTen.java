package ProgrammingDay;
import java.util.Scanner;

public class MultiplesOfTen {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a number to check multiple of ten or not");
	int n = scan.nextInt();
	if(n%10==0) {
		System.out.println("The number is multiple of ten");
	}
	else {
		System.out.println("Not multiple of ten");
	}
}
}
