package ProgrammingDay;
import java.util.Scanner;

public class PostiveOrNegatieOrZero {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
System.out.println("enter a number to check the no is postive or negative or zero ");
int n= scan.nextInt();
positivenumber(n);
}

	public static void positivenumber(int n) {
		if(n>0) {
			System.out.println("the no is positive");
		}
		else if(n<0) {
			System.out.println("the no is negative");
		}
		else {
			System.out.println("the no is zero");
		}
			}
		
	}