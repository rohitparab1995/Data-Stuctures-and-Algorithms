package module.rohit;

public class SelectionSort{
	public static void selectionSort(int[] arr)
	{
		int n = arr.length;
		for(int i=0 ; i<n-1 ; i++)
		{
			int minIndex = i;
			for(int j=i+1 ; j<n ; j++)
			{
				if(arr[minIndex] > arr[j])
					minIndex = j;
			}

				int temp = arr[minIndex];
				arr[minIndex] = arr[i];
				arr[i] = temp;

		}
	}
	
	public static void main(String args[])
	{
		int arr[] = {0,5,4,6,1,2,1,1,11};
		selectionSort(arr);
		for(int num:arr)
			System.out.println(num + " ");
	}
}