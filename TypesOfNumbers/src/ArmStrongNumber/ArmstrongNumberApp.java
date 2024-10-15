package ArmStrongNumber;
import java.util.Scanner;

public class ArmstrongNumberApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		For a 4 digit number, every digit would be raised to their fourth power
//		to get the desired result. 1634,153
		System.out.println("Enter a Number to check whether it is armstrong number or not");
		int n = scan.nextInt();
		ArmStrongNumber armStrongNumber= new ArmStrongNumber();
		int res=armStrongNumber.armStrongChecker(n);
		if (res==n) {
			System.out.println("The Number "+n+" is Armstrong Number");
		}
		else  {
			System.out.println("The Number "+n+" is  Not Armstrong Number");
		}

	}

}
