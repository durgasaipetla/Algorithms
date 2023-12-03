package Palindrome;
import java.util.*;
public class Palindrome {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in );
System.out.println("Enter a string to check it is palindrome or not...");
String s= sc.next();
boolean res=canFormPalindrome(s);
System.out.println(res);
}

public static boolean canFormPalindrome(String s) {
int j=s.length()-1;
for (int i = 0; i < s.length()-1; i++) {
	if(s.charAt(i)==s.charAt(j)) {
		j--;
	}
	else {
		return false;
	}
	
}
return true;
}
}
