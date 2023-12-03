package com.kodnest.binaryapproach;

import java.util.Scanner;
public class BinarySearchApp {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the array length");
	int arr[]= new int [sc.nextInt()];
	System.out.println("Enter the Array Elements in Ascending Order");
	
	for(int i=0;i<=arr.length-1;i++) 
	{
		arr[i]=sc.nextInt();
	}
	System.out.println("Enter the key to find....");
	int key=sc.nextInt();
	BinarySearch binarySearch=new BinarySearch();
	int res=binarySearch.searchbinary(arr,key);
	if(res>=0) 
	{
		System.out.println("Key "+key +" is found at index "+res+" in Array");
	}
	else 
	{
		System.out.println("Key is  Not Found at index ");
	}
}

}
	
	