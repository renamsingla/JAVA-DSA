package OOP;

public class Generic_class <T,P>{
	
	T x;
	T y;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Generic_class <Integer, Long> gc= new Generic_class<>();
//		we made an object of the generic class which has a pair
		
		Generic_class <Integer, Boolean> gc1= new Generic_class<>();

	}

}
