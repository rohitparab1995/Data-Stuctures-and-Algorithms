package module.rohit;

public class BinarySearchRotatedArray {
	static int binarySearch(int[] arr, int l, int h, int key) {
		
		if(l > h) return -1;
		int mid = l + (h-l)/2;
		if(arr[mid] == key) return mid;
		
		if(arr[l] <= arr[mid]) //1st half sorted array
		{
			if(arr[l] <= key && key <= arr[mid])
				return binarySearch(arr, l, mid-1, key);
			
			else return binarySearch(arr, mid+1, h, key);
		}
		else //2nd half sorted array
		{
			if(arr[mid+1] <= key && key <= arr[h])
				return binarySearch(arr, mid+1, h, key);
		}
		
		//1st Half not sorted, key is not in the range of 2nd half
		return binarySearch(arr, l, mid-1, key);
	}
	
	public static void main(String args[]) {
		int[] arr = {4,5,6,7,8,1,2,3};
		System.out.println("Found at : " + binarySearch(arr,0,arr.length-1,2));
	}
}