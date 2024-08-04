package day6;

public class CheckPalindrome {
	//Q6: remove junk or special character from a string
	public static void main(String[] args) {
		//Q5: check to see if a string is a palindrome or not.
		String input = "Oracle";
		
		System.out.println("Given string is a palindrome = " + isPalindrome(input));
		String doubtfulImput = "This is my string with special characters : *&^%$#@!";
		String result = doubtfulImput.replaceAll("[^a-zA-Z0-9]", "");//whatever is in the "[]" is kept and everything else is replaced by the ""
		System.out.println(result);
	}
	
	public static boolean isPalindrome(String str) {
		
		String reversed = "";
		for(int i = str.length() -1; i >=0; i--) {
			reversed += str.charAt(i);
		}
		return str.equals(reversed);
	}
	
	
	
	

}
