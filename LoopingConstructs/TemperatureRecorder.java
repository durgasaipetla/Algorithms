package com.kodnest.training.LoopingConstructs;
import java.util.Scanner;
public class TemperatureRecorder {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	 int arr[]=new int[7];
	 System.out.println("Enter Temperature values of a week");
	 for (int i = 0; i <= arr.length-1; i++) 
	 {
		arr[i]=sc.nextInt();
     }
	 int sum=0;
	 for (int i=0;i<=arr.length-1;i++) 
	 {
	    sum=sum+arr[i];
	 }
	 int avg=(sum/arr.length);
	 System.out.println("The Average Temperature of a Week is :"+avg);
}
}
