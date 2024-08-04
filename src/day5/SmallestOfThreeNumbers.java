package day5;

public class SmallestOfThreeNumbers {
	
	public static void main(String[] args) {
		
		int a = 89, b = 67, c = 37, smallest;
		//comparing between a and b and extracting the smaller value
		int temp = (a < b) ? a : b;
		//Compare temp with c and store the result in smallest
		smallest = (c < temp) ? c: temp;
		
		System.out.println("The smallest number is: " + smallest);
		//single line approach:
		smallest = c < (a < b ? a :b) ? c : (a < b ? a :b);
		
	}

}
