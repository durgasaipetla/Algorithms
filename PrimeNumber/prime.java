package PrimeNumber;
import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
	Scanner scan= new Scanner(System.in);
	System.out.println("Enter the Number to Check Prime or Not ");
	int n=scan.nextInt();
	if (n<2) 
	{
		System.out.println("It is Not an Prime");
	}
	else {
		for(int i=2;i<=Math.sqrt(n);i++) {
			if(n%i==0) 
			{
				System.out.println("Entered number is Not an Prime");
				return;
			}
		}
		System.out.println("The Number is Prime");
		
	}
	}

}
