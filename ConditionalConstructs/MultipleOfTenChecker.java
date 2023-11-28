package ConditionalConstructs;
import java.util.Scanner;

public class MultipleOfTenChecker {
public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter first number");
	int n = sc.nextInt();
	System.out.println("Enter second number");
	int m= sc.nextInt();
	checkMultipleOfTen(n,m);
}

public static void checkMultipleOfTen(int n,int m) {
if (n%m==0)	{
	System.out.println("The First Number is Multiple of Second number");
}
else {
	System.out.println("The First Number is Not Multiple of Second number");
}
}
}
