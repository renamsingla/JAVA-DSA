package OOP;

public class Abstract_client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Anonymous way 
		Abstract_demo ab1= new Abstract_demo() {

			@Override
			public void Payment() {
				// TODO Auto-generated method stub
				
			}
			
		};
		
		Abstract2 ab= new Abstract2();
		ab.Payment();
		

	}

}
