package OOP;

public class I_client implements I_dsa{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		object is made of the class
		I_client ic= new I_client();

	}

	@Override
//	fun method will get body once only, even though it was present in two interfaces
//	hence multiple inheritance achieved by interface
	public void fun() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void push(int item) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int pop() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int peek() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

}
