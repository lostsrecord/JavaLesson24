package day2;

public class IncrementOperatorDemo {
	
	public static void main(String[] args) {
	
		//Increment operator ++
		
		int a = 10;
//		a = a +1;
		a++;
		
		System.out.println(a);//11
		
		//post increment
		int x = 10;
		int result = x++;
		System.out.println(result);//10, does not show the added number only shows x = 10 before the increment
		
		//preincrement
		int b = 20;
		int res = ++b;
		System.out.println(res);//21 by having the ++ before the variable we increase the number and then assign the variable to res
		
		
		
		
		
		
		
	
	}
	
	
	
	
	

}
