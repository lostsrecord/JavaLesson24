package day2;

public class IfCondition {
	
	public static void main(String[] args) {
		
		/*conditional statements
		 * 
		 * if
		 * if else
		 * switch statement
		 * 
		 */
		
		/*
		 *if (boolean condition)
		 *{
		 * block of code or statement
		 * }
		 */
		
		//Example 1:
		if(true) {
			System.out.println("We speak the truth.");
		}
		System.out.println("End the program.");
		
		
		//Example 2:
		int person_age = 10;
		if(person_age >=18) {
			System.out.println("Eligible to vote.");
		}else {
			System.out.println("Not eligible to vote.");//IF the if block is false then the the else block is executed 
		}
		
		System.out.println("End the program.");
		
		
	}
	
	
	
	
	
	
	
	
	

}
