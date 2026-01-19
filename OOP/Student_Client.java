package OOP;

public class Student_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		to connect student class and use it here 
//		we write same as what we use to for ArrayList
		
		Student s= new Student();
		
		System.out.println(s.name);
		System.out.println(s.age);
		
//		to change the name and age
		s.name="abc";
		s.age=10;
		s.Introduction();
		s.SayHi("xyz");
		
//		accessing static function
		Student.placename();
	}
//	static block of main- will run the first- pre-main method
	static {
		System.out.println("static block from the main");
	}

}
