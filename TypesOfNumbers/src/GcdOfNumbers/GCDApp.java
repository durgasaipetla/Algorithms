package GcdOfNumbers;
import java.util.Scanner;

public class GCDApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter two numbers to find gcd");
		int m = scan.nextInt();
		int n = scan.nextInt();
		int res=GCD.findGcd(m, n);
		System.out.println("GCD of "+m+" and "+n+" is "+res);
	}

}
