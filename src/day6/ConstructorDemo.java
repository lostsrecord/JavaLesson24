package day6;

public class ConstructorDemo {		//constructor name has to match the class name

	String name;
	String streetName;
	int houseNumber;
	String zipCode;
	
	public ConstructorDemo(String name, String streetName, int houseNumber, String zipCode) {
		this.name = name;
		this.streetName = streetName;
		this.houseNumber = houseNumber;
		this.zipCode = zipCode;
		//constructor will never have any return
	}
	
	
	public String declareAddress() {
		return (name + "\n" + houseNumber + ", " + streetName + "\n" + zipCode);
	}
	
	
	
	

}
