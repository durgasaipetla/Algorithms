package com.kodnest.training.LoopingConstructs;

import java.util.Scanner;

public class CountingGrades {
public static void main(String[] args) {
 Scanner sc =new Scanner(System.in);
 System.out.println("Enter the number of students....");
 int arr[]=new int[sc.nextInt()];
 System.out.println("Enter the student marks elements");
 for (int i = 0; i <= arr.length-1; i++) 
 {
	int res=sc.nextInt();
	if(res>=0&&res<=100) 
	{
	arr[i]=res;
	}
	else {
		System.out.println("please enter valid marks");
		res=sc.nextInt();
		if(res>=0&&res<=100) 
		{
		arr[i]=res;
		}
		else {
			System.out.println("Is ur eyes are damaged ");
			return;
		}

	}
	
 }
 int count=0;
 for (int i : arr) 
 {   
	 if(i>75) 
	 {
		count++;
	 }
}
 System.out.print(count+" Students scored more than 75 ");
}
}
