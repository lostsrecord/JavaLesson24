package day5;

public class StringManipulation {
	
	public static void main(String[] args) {
		
		//strings are immutable - it can not be changed, an array of characters
		
		String s = "Welcome";// this string is a string literal and stored in a predetermined place in heap, constant memory pool
		String s2 = new String("Welcome");//through string object	
//		s = "Welcome to Java Selenium"; //this s and the one above are not stored in the same place and are not replaced
		
		//***to learn important methods of string class***
		
		//length() -- counts all the characters in a string and returns the number in int data type
		
		int length = s2.length();
		System.out.println("The length is: " + length);
		
		System.out.println(s.length());//11
		
		//concat() -- join multiple strings
		String s1 = "Welcome";
		String s3 = " to Java";
		String s4 = " programming.";
		System.out.println(s1 +s3); //another method to join them but not recommended use below
		System.out.println(s1.concat(s3).concat(s4));//"Welcome to Java programming
		
		//trim() -- would trim any leading and trailing spaces from a string
		s = "     Welcome to Java      ";//leading space is the space before W and trailing is space after java
		System.out.println(s.length());
		s.trim();
		System.out.println(s.length());//this will still call the original length of the string not trimmed
		System.out.println(s.trim().length());//you have to save the call method as variable if you want to call the modified call
		
		
		//charAt() -- returns a single character out of a string from specific index
		s = "Java Selenium";
		System.out.println(s.charAt(5)); //S, array index starts from 0
		System.out.println(s.charAt(5));
		
		//contains() -- returns a boolean statement(true or false)
		//checks a string is a part of the main string or not
		System.out.println(s.contains("jav"));//true or false, should be false because j is lowercase
		System.out.println(s.contains("Sel")); // true
		System.out.println(s.contains("ium")); // true
		System.out.println(s.contains("Sli")); //false, can not check inbetween characters  
		System.out.println(s.contains("a S")); //true 
		//anything that is part of the original will be true only if its all one after the other 
		
		//equals(), equalsIgnoreCase() -- compared two strings and returns true or false
		s1 = "Welcome";
		s2 = "welcome";
		System.out.println(s1.equals("welcome")); //false, "welcome" can also be s2
		System.out.println(s1.equalsIgnoreCase(s2));//true
		
		//replace() -- it replaces a single character or character sequence of a given string
		s = "welcome to java selenium automation";
		
		System.out.println(s.replace("w","W"));//the first postition is exactly what you want to replace and second is the new character
		System.out.println(s.replace("java", "python"));
		
		
		//substring() -- extracts substing from the main string
		System.out.println(s.substring(11));//java selenium automation
		System.out.println(s.substring(11, 15));//java, the last character does not get included
		
		//toUpperCase()   toLowerCase() -- converts cases
		s = "Welcome";
		System.out.println(s.toUpperCase());//WELCOME
		System.out.println(s.toLowerCase());//welcome
		
		//split() -- to split or divide original string into multiple parts based on a delimiter
		s = "abc@xyz";
		String a[] = s.split("@");
		System.out.println(a[1]);
		s = "welcome to java selenium automation";
		String b[] = s.split(" ");
		System.out.println(b[0]);//welcome
		System.out.println(b[3]);//selenium
		
		s = "welcome to java selenium automation";//replace " " with"_"
		System.out.println(s.replace(" ", "_"));
		
		s = "abc,123@m.com";
		String[] c = s.split(",");
		System.out.print(c[0]);
		
		
		
		
/*		int num = 100;
		num = 2000; //num starts as 100 and then changes to 2000
*/		
		
		
	}
	
	
	

}
