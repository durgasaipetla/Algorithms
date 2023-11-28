package ProgrammingDay;

import java.util.Scanner;

public class TerniaryOperator {
public static void main(String[] args) {
	int a,b,c,temp,smallest;
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter numbers a,b,c");
	 a=sc.nextInt();
	 b=sc.nextInt();
	 c=sc.nextInt();
	temp=a<b?a:b;
	smallest=c<temp?c:temp; 
	
	System.out.println("The smallest no is "+smallest);
}
}
