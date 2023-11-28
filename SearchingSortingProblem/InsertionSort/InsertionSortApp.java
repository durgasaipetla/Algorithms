package InsertionSort;
import java.util.Scanner;

public class InsertionSortApp {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter the length of an array");
	int arr[]= new int[sc.nextInt()];
	System.out.println("enter array elements");
	for (int i = 0; i <=arr.length-1; i++) 
	{
		arr[i]=sc.nextInt();
	}
	System.out.println("printing the array contents before sorting");
    for (int i : arr) 
    {
    	System.out.print(i+" ");
	}
    System.out.println();
    InsertionSort sort= new InsertionSort();
    sort.insertionSort(arr);
    System.out.println("printing the array contents after sorting");
    for (int x : arr) 
    {
    	System.out.print(x+" ");
		
	}
}
}
