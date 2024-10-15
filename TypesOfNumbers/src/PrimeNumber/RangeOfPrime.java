package PrimeNumber;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;
public class RangeOfPrime {

public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
System.out.println("Enter the range of prime");
//ArrayList array = new ArrayList();
int n= sc.nextInt();
int count=0;
for(int i=2;i<=n;i++) {
	int res = checkPrime(i);
	if (res!=0) {
		System.out.println(res);
		count++;
	
		}
	}


//for(int i=0;i<list.size();i++) {
//	System.out.println(list.get(i));
//}



}

	private static int array(int i) {
	// TODO Auto-generated method stub
	return 0;
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
