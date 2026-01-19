package BitMasking;

public class Odd_Even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//check whether the number is odd or even, do not use any mathematical operator
		int n=10;
		if((n&1)!=0) {
//		here number will be changed to bit by itself only	
			System.out.println("it is an odd number");		
		}else {
			System.out.println("its an even number");
		}
	}

}
