package day5;

public class PalindromeOrNot {
	
	public static void main(String[] args) {
		
		int originalNumber = 868, reverse = 0;
		System.out.println("The original number is: " + originalNumber);
		int number = originalNumber;
		
		while(number !=0) {
			int remainder = number % 10;
			reverse = reverse * 10 + remainder;
			
			number = number /10;// at the end of the loop number = 0 and reverse takes the original value
			
		}
		System.out.println("The reverse number is: " + reverse);
		
		if (originalNumber == reverse) {
			System.out.println("It is a palindrome");
		}else {
			System.out.println("It is not a palindrome");
		}
		
	}

}
