package SelectionSort;
import java.util.Scanner;

public class SelectionSortApp {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
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
	SelectionSort sort= new SelectionSort();
	sort.sortTechnique(arr);
	System.out.println("printing the array elements after Selection sorting");
	for (int i : arr) 
	{
     System.out.print(i+" ");		
	}
}
}
