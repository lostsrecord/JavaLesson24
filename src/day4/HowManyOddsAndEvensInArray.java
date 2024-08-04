package day4;

public class HowManyOddsAndEvensInArray {
	
	public static void main(String[] args) {
		
		int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		int even = 0;
		int odd = 0;
		
		for(int var :a) {
			if(var%2 == 0) {
				even++;
			}else {
				odd++;
			}
		}
		
		System.out.println("Number of even numbers: " + even);
		System.out.println("Number of odd numbers: " + odd);
	}

}
