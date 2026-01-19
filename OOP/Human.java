package OOP;

public class Human {
	
	private String name="abc";
	private int age=10;
	
	public Human(String name, int age) {
		this.name= name;
		this.age=age;
	}
	
//	setter for age
//	here throws exception is exception thrown to the one calling this method
//	public void SetAge(int age) throws Exception{
//		if(age<0) {
////			generation of exception
//			throw new Exception("age cannot be negative");
//		}
//		this.age= age;
//	}
	
//	handling exception by itself
	public void SetAge(int age) {
		try {
			if(age<0) {
//				generation of exception
				throw new Exception("age cannot be negative");
			}
			this.age= age;
//			here e has the address of the exception thrown
		}catch(Exception e){
//			this will the error details
			e.printStackTrace();
			
		}
		
	}
//	getter for age
	public int GetAge() {
		return age;
	}
	
//	setter for name
	public void SetName(String name) {
		this.name=name;
	}
//	getter for name
	public String GetName() {
		return name;
	}

}
