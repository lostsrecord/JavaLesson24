package day6;
import java.util.Arrays;
public class LargestAndLowest {
	//Q4 Find the largest and lowest numbers of an array.
	public static void main(String[] args) {
		//using iteration (greedy approach):
		int arr[]= {3 , 8, 8, 9, 2, 67, 34};
		
		int mini = arr[0];
		int max = arr[0];
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] < mini) {
				mini = arr[i];
			}else if(arr[i] > max) {
				max = arr[i];
			}
		}
		
		System.out.println("The minimum number: " + mini);
		System.out.println("The maximum number: " + max);
		
		//using predefined functions/library
		int minimum = Arrays.stream(arr).min().getAsInt();//turns the array into a stream and then from there it will get the minimum value and then it will show as an interger
		int maximum = Arrays.stream(arr).max().getAsInt();
		System.out.println("Minimum: " + minimum);
		System.out.println("Maximum: " + maximum);
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	

}
