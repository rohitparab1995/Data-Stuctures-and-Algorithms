package module.AlgoExpertPrograms;

import java.util.Arrays;

public class TwoNumberSum2 {

	public static void main(String[] args) {
		int[] arr = {3,5,-4,8,11,1,-1,6}; //sum = 13 : 8 & 5
		
		Arrays.sort(arr); // Sort my an algorithm like merge sort
		for(int i=0,j=arr.length-1 ; i < j ; )
		{
			int sum = arr[i] + arr[j];
						
			if(sum == 13) 
			{
				System.out.println(arr[i]+ " " + arr[j]);
				break;
			}
			else if(sum < 13) i++; 
			else j--;			
		}

	}

}
