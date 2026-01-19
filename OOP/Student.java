package OOP;

public class Student {
//	CLASS KA DATA MEMBER
	
	String name;
	int age;
	
	
//	Introduction method
//	we made it a non-static method 
//	THIS IS CLASS KA MEMBER FUNCTION
	public void Introduction() {
		
		System.out.println("My name is "+ name + " and my age is "+ age);
	}
	
	public void SayHi(String name) {
		System.out.println(this.name + " says hi " + name);
	}
	
	public static void placename() {
		System.out.println("delhi");
	}
	
//	static block
	static {
		System.out.println("i am in a static block");
	}

} 
