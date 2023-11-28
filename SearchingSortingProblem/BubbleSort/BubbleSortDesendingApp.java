package BubbleSort;
import java.util.Scanner;

public class BubbleSortDesendingApp {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter the array length");
	
	int arr[]=new int[sc.nextInt()];
	System.out.println("enter the array elements");
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
	BubbleSortDesending sort= new BubbleSortDesending();
	sort.SortBubbleInDescending(arr);
	System.out.println("printing the array elements after Desending Bubble sorting");
	for (int x : arr) 
	{
		System.out.print(x+" ");
	}

}
}
