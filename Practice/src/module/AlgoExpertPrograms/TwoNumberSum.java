package module.AlgoExpertPrograms;

import java.util.HashSet;

public class TwoNumberSum {

	public static void main(String[] args) {
		int[] arr = {3,5,-4,8,11,1,-1,6};
		
		HashSet<Integer> hs = new HashSet<>();
		
		for(int i=0 ; i < arr.length ; i++)
		{
			int temp = 10 - arr[i];
			System.out.println(hs);
			
			if(hs.contains(temp)) 
			{
				System.out.println(arr[i]+ " " + temp);
				break;
			}
			
			hs.add(arr[i]);
		}

	}

}
