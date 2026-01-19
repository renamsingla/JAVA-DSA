package OOP;

public class Person_client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p1= new Person();
//		System.out.println(p1.name);
//		System.out.println(p1.age);
		
		Person p2= new Person("xyz",20);
//		System.out.println(p2.name);
//		System.out.println(p2.age);
		
//		WE CANNOT GET THE DATA MEMBERS NOW, BECAUSE THEY ARE PRIVATE
		
		System.out.println(p1.getAge()); //getting the age
		p1.setAge(19);     //changing the age
		System.out.println(p1.getAge());   //getting the updated age
		

	}

}
