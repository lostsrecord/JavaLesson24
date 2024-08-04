package day4;

import java.util.Arrays;

public class ArrayDemo {
	
	public static void main(String[] args) {
		//declaring an array
//		int myArray[] = new int[5];//this created an index in the heap memory with 5 positions going 0-4, java starts from 0
		int [] myArray = new int[5];
		
		//assign values to the array
		myArray[0] = 10;
		myArray[1] = 20;
		myArray[2] = 30;
		myArray[3] = 40;
		myArray[4] = 50;
		
		//extract value from the array
		System.out.println(myArray[4]);//50
		
		//finding the length of the array
		int length = myArray.length;
		System.out.println("The length of the Array is: " + length);
		
		//declaring and assigning values at one go
		int a[] = {1, 2, 3, 4, 5};
		System.out.println(a[4]);//5
		
		//extract all the values or printing all the values of the array	
		System.out.println(Arrays.toString(myArray));
		
		//print all the values using for loop
		for(int i=0; i<5; i++) {
			System.out.println(myArray[i]);
		}
		
		System.out.println("**** using enhanced for loop ****");
		//use enhanced for loop to print all the values of the array
		//enhanced for loop can only go forward in increment and not decrement, from the first index to the last index
		for(int mA :myArray) {
			System.out.println(mA);
		}
		System.out.println("**** printing in reverse order ****");
		//printing values from last index entry to the first index
		for(int i = myArray.length -1; i>=0; i--) {
			System.out.println(myArray[i]);
		}
		
		//System.out.println(a);//not possible 
		
		
	}
	
	
	
	

}
