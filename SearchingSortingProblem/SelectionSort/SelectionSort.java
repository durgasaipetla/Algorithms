package SelectionSort;

public class SelectionSort {
void sortTechnique(int arr[]) {
	int help;
	for (int i = 0; i <= arr.length-2; i++) {
		int min = arr[i];
		int pos =i;
		for (int j = i+1; j <= arr.length-1; j++) 
		{
			if(arr[j]<min) 
			{
				min=arr[j];
				pos=j;
			}
		}
		 help= arr[i];
		 arr[i] =arr[pos];
		 arr[pos]=help;
	}
}
}
