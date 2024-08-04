package day6;

import java.util.Arrays;

public class SortElementsOfAnArray {
	
	public static void main(String[] args) {
		//Q3: Sort elements of an array.
		//using predetermined class
		int array[] = {89, 76, 2, 34, 5, 7, 56};
		
		Arrays.sort(array);
		System.out.println("Elements of array in ascending order: ");
		for(int value : array) {
			System.out.print(value + " ");
		}
		System.out.println();
		sortMyarray(array);
			
	}
	/* this is wrong for some reason
	public static void sortMyarray(int[]givenArray) {
		int length = givenArray.length;
		for(int i = 0; i < length; i++) {
			for(int j = 0; j< length; j++) {
				if(givenArray[j] > givenArray[j+1]) {
					int temp = givenArray[j];
					givenArray[j] = givenArray[j+1];
					givenArray[j+1] = temp;
				}
			}
			
		}
		System.out.println("Sorted array: ");
		
		for(int value : givenArray) {
			System.out.print(value + "\t");
		}
	}
	*/
	//below is correct for some reason
	public static void sortMyarray(int[] givenArray) {
		int length = givenArray.length;
		for(int i = 0; i < length; i++) {
			for(int j=0; j < length -i-1; j++) {
				if(givenArray[j] > givenArray[j+1]) {
					int temp = givenArray[j];
					givenArray[j] = givenArray[j+1];
					givenArray[j+1] = temp;
				}
			}
		}
		System.out.println("Sorted array: ");

		for(int value :givenArray) {
			System.out.print(value + "\t");
		}
	}
	

}
