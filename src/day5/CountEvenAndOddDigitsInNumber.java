package day5;

public class CountEvenAndOddDigitsInNumber {
	
	public static void main(String[] args) {
		
		int num = 251, oddcount = 0, evencount = 0;
		
		while (num > 0) {
			int digit = num % 10;
			if (digit % 2 == 0) {
				evencount ++;
			}else {
				oddcount ++;
			}
//			num /= 10;
			num = num / 10;
		}
		System.out.println("Even count: " + evencount);
		System.out.println("Odd count: " + oddcount);
	}

}
