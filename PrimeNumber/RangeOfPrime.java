package PrimeNumber;
import java.util.Scanner;

public class RangeOfPrime {

public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
System.out.println("enter the range of prime");
int n= sc.nextInt();
int count=0;
for(int i=3;i<=n;i++) {
	int res = checkPrime(i);
	if (res!=0) {
		System.out.println(res);
		count++;
	
		}
	}
System.out.println("no of prime nos "+count);
}

	public static int checkPrime(int n) 
	{
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				return 0;
			}
		}
		return n;
	}

}
