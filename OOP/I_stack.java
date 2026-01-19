package OOP;

public interface I_stack {
	
	public void fun();
	
	public void push(int item);
	
	public int pop();
	
	public int peek();
	
	public static final int x=90;
//	x needs to be initialised because it is an interface and hence no object will be created;
//	therefore it wont have 0 automatically( default value) , hence initialise it.
	
	int y=2; 

}
