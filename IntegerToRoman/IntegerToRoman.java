package IntegerToRoman;

import java.util.Scanner;

public class IntegerToRoman {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter a number to check it's roman value");
	int a=sc.nextInt();
	String srr[]= {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
	int arr[]={1000,9000,500,400,100,90,50,40,10,9,5,4,1};
	StringBuffer sb= new StringBuffer();
	for(int i=0;i<arr.length;i++) {
		if(a>=arr[i]) {
			sb.append(srr[i]);
			a=a-arr[i];
			i--;
		}
	}
	String s2= new String(sb);
	System.out.println(s2);
}
}
