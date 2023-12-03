package com.kodnest.binaryapproach;

public class BinarySearch {
	int searchbinary(int arr[],int key) {
	int low =0;
	int high =(arr.length-1);
	while(low<=high) 
	{
		int mid = (low+high)/2 ;
		if(key==arr[mid]) 
		{
			return mid;
		}
		else if (key>arr[mid]) 
		{
			low =mid+1;
			
		}
		else 
		{
			high=mid-1;
		}
	}
	return -1;
}
}

