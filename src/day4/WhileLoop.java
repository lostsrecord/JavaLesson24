package day4;

public class WhileLoop {
	
	public static void main(String[] args) {
		/*
		//initialization; condition/logic; increment/decrement 
		System.out.println("**** Using For Loop ****".repeat(2));
		for (int num = 1; num <= 5; num++) {
			System.out.println(num);
		}
		System.out.println("**** Using While Loop ****".repeat(2));
		//print 1 to 5 using while loop
		int num = 1; 
		while(num <= 5) {
			System.out.println(num);
			num ++;
		}
		
		//print 1 to 5 using do while loop
		System.out.println("**** Using do whil Loop ****".repeat(2));
		int number = 1;
		do {
//			System.out.println(number);
			System.out.println("**Nazmul**");
			number++;
		}while(number<=5);
		*/
		
		//situation 1
		for (int i=1; i<=10; i++) {
			System.out.println(i);
			//keep the code intact, exclude printing 6-10
			if(i==5) {
				break;//jumping statement
			}
		
		}
		
		
		//situation 1: print all the numbers less than 5 
		
		for (int i= 1; i <= 10; i++) {
			if(i==5) {
				continue;//also jump statement 
						//skip the current sequence, bypasses the value of 5 in the print sequence so it is not printed
			}
			System.out.println(i);
			
		}
		
		
		
		
		
	}
	
	
	
	
	

}
