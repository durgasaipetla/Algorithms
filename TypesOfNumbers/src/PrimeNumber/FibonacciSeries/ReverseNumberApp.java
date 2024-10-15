package PrimeNumber.FibonacciSeries;
import java.util.Scanner;
public class ReverseNumberApp {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("enter a number to reverse");
	int n= scan.nextInt();
	Reverse  demo= new Reverse ();
	int  rev=demo.reverseNumber(n);
	System.out.println("After reversing the number is: "+rev);
}
}
