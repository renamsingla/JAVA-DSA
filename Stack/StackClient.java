package Stack;

public class StackClient {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		stack s=new stack();
		
		s.push(10);
		s.push(20);
		s.push(30);
		
		System.out.println(s.peek());
		s.display();
		
		System.out.println(s.pop());
		s.display();
		
		System.out.println(s.isEmpty());
//		s.push(40);
//		s.push(50);
//		s.push(50);
//		s.push(60);
		
		s.pop();
		s.pop();
		s.peek();
		
		
	}

}
