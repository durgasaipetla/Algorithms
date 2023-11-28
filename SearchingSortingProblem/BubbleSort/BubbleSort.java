package BubbleSort;

public class BubbleSort {
void SortBubble(int arr[]) {
	int temp;
	for (int i = 0; i <= arr.length-2; i++) 
	{
	for(int j=0;j<=arr.length-2-i;j++) 
	{	
		if(arr[j]>arr[j+1])
		{
			temp=arr[j+1];
			arr[j+1]=arr[j];
			arr[j]=temp;
		}
	}
	}
}
}
