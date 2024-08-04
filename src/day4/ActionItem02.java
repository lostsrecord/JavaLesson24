package day4;

public class ActionItem02 {
	
	public static void main(String[] args) {
		
		
		System.out.println("Fractorial is: " + doFactorial(9));
		System.out.println("Fahrenhiet value is: " + convertToFahrenheit(42));
		
		
		
	}
	
	public static long doFactorial(int number) {
		//declare a new int type variable
		long factorial = 1;//we use long because when multiplying the numbers can become very large very quickly
		while(number > 1) {
			factorial *=number;//we are multiplying subsequent values with factorial
			number --;//decrementing the given in every iteration
		}
		
		return factorial;
		
	}
	
	public static double convertToFahrenheit(int celcius) {
		double fahrenhiet;
		fahrenhiet = ((celcius * 9)/5) + 32; //conversion formula 
		return fahrenhiet;
	}
	
	

}
