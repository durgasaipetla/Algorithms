package BubbleSort;
import java.util.Scanner;

public class BubbleSortApp {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the array length");
	
	int arr[]=new int[sc.nextInt()];
	System.out.println("Enter the array elements");
	for (int i = 0; i <= arr.length-1; i++) 
	{
		arr[i]=sc.nextInt();
	}
	System.out.println("Printing of array elements before sorting");
	for (int i : arr) 
	{
     System.out.print(i+" ");		
	}
	System.out.println();
	BubbleSort sort= new BubbleSort();
	sort.SortBubble(arr);
	System.out.println("printing the array elements after Bubble sorting");
	for (int x : arr) 
	{
		System.out.print(x+" ");
	}
}
}
	
	

