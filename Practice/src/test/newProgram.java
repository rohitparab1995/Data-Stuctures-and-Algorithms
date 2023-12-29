package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class student{
	private double score;
	private String name;
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public student(double score, String name) {
		this.score = score;
		this.name = name;
	}
	
}
public class newProgram {

	public static void main(String[] args) {

		List<Integer> arr = new ArrayList<>();
		int sum = 11;
		arr.add(0);
		arr.add(14);
		arr.add(0);
		arr.add(4);
		arr.add(7);
		arr.add(8);
		arr.add(3);
		arr.add(5);
		arr.add(7);
		arr.add(0);
		arr.add(9);
		arr.add(2);
		arr.add(11);
		arr.add(0);
		arr.add(2);
		arr.add(9);
		arr = arr.stream().sorted().distinct().collect(Collectors.toList());
		//List temp = student.stream().sorted(null).collect(Collectors.toList());
		System.out.println(arr);		
		
		for(int i = 0 , j = arr.size()-1 ; i < j ;)
		{
			int tempSum = arr.get(i) + arr.get(j);
			if(tempSum == sum) System.out.println("Pair : " + arr.get(i) +" "+ arr.get(j));
			
			if(tempSum < sum) i++; 
			else j--;
		}
		
		
			
	}

}
