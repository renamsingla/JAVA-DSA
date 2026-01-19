package OOP;

public class Person {
	
	private String name="abc";
	private int age= 10;
	
//	this is a constructor
	public Person() {
		
	}
	
//	this is also a constructor, parameterised constructor
//	constructor work- initialise data member of a class
	public Person(String name, int age) {
		this.name= name; //here this keyword points to the class members
		this.age= age;
	}
	
//	ENCAPSULATION
//	Setter method
	public void setAge(int age) {
		this.age=age;
	}
	
//	Getter method 
	public int getAge() {
		return age;
//		here we do not need to write this because their is no local variable age 
//		in this function, hence age only would refer to class data member
	}
	

}
