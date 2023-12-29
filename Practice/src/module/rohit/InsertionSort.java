package module.rohit;

public class InsertionSort{
	public static void insertionSort(int[] arr)
	{
		int n = arr.length;
		for(int i=1 ; i<n ; i++)
		{
			int key = arr[i];
			int index = i-1;
			
			while(index >= 0 && arr[index] > key)
			{
				arr[index+1] = arr[index];
				index--;
			}
			
			arr[index+1] = key;
		}
	}
	
	public static void main(String args[])
	{
		int arr[] = {5,4,6,2,1};
		insertionSort(arr);
		for(int num:arr)
			System.out.println(num + " ");
	}
}