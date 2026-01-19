package OOP;

public interface Inter {
//	creating an interface for stack
	
	public void push(int item);
	
	public int pop();
	
	public int peek();
	
	public static final int x=90;
//	x needs to be initialised because it is an interface and hence no object will be created;
//	therefore it wont have 0 automatically( default value) , hence initialise it.
	
	int y=2; 
	
//	java8 feature
	static void f1() {
		
	}
	
	default void f2() {
		
	}
	
//	java9
	
	private void f3() {
		
	}
}
