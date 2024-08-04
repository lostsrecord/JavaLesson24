package day6;

/*1) Method name is a user defined name
 * but it should display the intent of performing an action
 * 2) Method may or may not return any value
 * 3) Method may or may not accept parameters
 * 4) Method can be invoked through objects, using reference variable
 * 5) A method is created to perform some action
 * 
 */
public class MethodDemo {
	
	//1) No parameter and no return
	
	public void methodOne() {
		System.out.println("Hey, we are learning method!");
	}
	
	//2) No parameter and returns value
	public String methodTwo() {
		String a = "Hello.";
		String b = " How are you?";
		return a + b;
		//do not add any code after return as it is dead code.
	}
	
	//3) Accept a parameter but does not return
	public void methodThree(String name) {
		System.out.println(name + ", How are you?");
	}
	
	//4) accepting a parameter an returning a value
	public int add(int a, int b) {
		return (a + b);
	}
	

}
