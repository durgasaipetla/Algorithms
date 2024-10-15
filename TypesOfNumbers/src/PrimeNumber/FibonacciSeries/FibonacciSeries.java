package PrimeNumber.FibonacciSeries;
import java.util.Scanner;

public class FibonacciSeries {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a no to find fibonacci series");
	int n = scan.nextInt();
	fibonacciseries(n);
}

public static void fibonacciseries(int n) {
	int fib1=0;
	int fib2=1;
	int nextNo=0;
	
if (n==1) {
	System.out.println(fib1);
}
else if (n==2) {
	System.out.println(fib1+" "+ fib2);
}
else {
	System.out.print(fib1 +" "+ fib2+" " );
	for(int i=3;i<=n;i++) {
		nextNo=fib1+fib2;
		System.out.print(nextNo+" ");
		fib1=fib2;
		fib2=nextNo;
	}
}
}
}
