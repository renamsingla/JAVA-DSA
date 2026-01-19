package Queue;

import java.util.Stack;

public class Queue_using_Stack {
	private Stack<Integer>st;
	public Queue_using_Stack() {
		st= new Stack<>();
	}
	
	public int size() {
		return st.size();
	}
	
	public boolean isEmpty() {
		return st.isEmpty();
	}
	
	public void Enqueue(int item) {
		Stack<Integer> hlp= new Stack<>();
		while(!st.isEmpty()) {
			hlp.push(st.pop());
		}
		st.push(item);
		while(!hlp.isEmpty()) {
			st.push(hlp.pop());
		}
	}
	public int Dequeue() {
		return st.pop();
	}
	
	public int getFront() {
		return st.peek();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue_using_Stack q= new Queue_using_Stack();
		q.Enqueue(10);
		q.Enqueue(20);
		q.Enqueue(30);
		q.Enqueue(40);
		q.Enqueue(50);
		System.out.println(q.Dequeue());
		System.out.println(q.getFront());
		q.Enqueue(60);
		q.Enqueue(70);
		

	}

}
