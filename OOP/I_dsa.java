package OOP;

//I_dsa has inherited the other two interfaces
public interface I_dsa extends I_stack, I_dynamic_stack{
	
	public int size();
	
	public boolean isEmpty();
}
