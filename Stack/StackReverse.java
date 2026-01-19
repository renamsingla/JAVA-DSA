package Stack;

import java.util.Stack;

public class StackReverse {
	private static void insert(Stack<Integer>st, int item) {
		if(st.isEmpty()) {
			st.push(item);
			return;
		}
		int x=st.pop();
		insert(st,item);
		st.push(x);
	}
	private static void reverse(Stack<Integer>st) {
		if(st.isEmpty()) {
			return;
		}
		int item=st.pop();
		reverse(st);
		insert(st,item);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer>st= new Stack<>();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		System.out.println(st);
		reverse(st);
		System.out.println(st);

	}

}
