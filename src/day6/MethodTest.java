package day6;

public class MethodTest {
	
	public static void main(String[] args) {
		
		MethodDemo m = new MethodDemo();
		m.methodOne();
		String result = m.methodTwo();
		System.out.println(result);
		
		m.methodThree("Sarmin");//string needs "
		
		int sum = m.add(100, 300);//int needs numbers
		System.out.println(sum);
	}

}
