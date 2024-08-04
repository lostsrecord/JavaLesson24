package day6;

public class Test {
	
	public static void main(String[] args) {
		//create an object of student class
		//and save under a reference variable
		Student student1 = new Student();
		student1.sid = 1001;
		student1.name = "David";
		student1.grade = 'A';
		student1.printStudentData();
		
		String s = new String("Welcome");
		s.length();//.length() is predefined method
		s.replaceAll("W", "X");
		/*
		Employee	emp1 = new Employee();
		emp1.eid = 7007;
		emp1.name = "Smith";
		emp1.department = "Finance";
		emp1.salary = 130000;
		
		emp1.display();
		*/
		new Employee().name = "Srvani";
		new Employee().eid = 8000;
		new Employee().department = "Quality Assurance";
		new Employee().salary = 125000;
		new Employee().display();//this is printing only the base values because it created a new object rather than referencing the already created objects 
	}

}
