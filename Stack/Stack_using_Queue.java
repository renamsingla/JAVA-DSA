package Stack;

import Queue.Dynamic_Queue;

public class Stack_using_Queue {
	private Dynamic_Queue q;
	public Stack_using_Queue() {
		q= new Dynamic_Queue();
	}
	
	public int size() {
		return q.size();
	}
	public boolean isEmpty() {
		return q.isEmpty();
	}
	 
	public void push(int item) throws Exception { //O(1)
		q.Enqueue(item);
	}
	public int pop() throws Exception {   //O(n)
		Dynamic_Queue hlpq= new Dynamic_Queue();
		while(q.size()>1) {
			hlpq.Enqueue(q.Dequeue());
		}
		int item=q.Dequeue();
		while(hlpq.size()>0) {
			q.Enqueue(hlpq.Dequeue());
		}
		return item;
	}
	
	public int peek() throws Exception {
		Dynamic_Queue hlpq= new Dynamic_Queue();
		while(q.size()>1) {
			hlpq.Enqueue(q.Dequeue());
		}
		int item=q.Dequeue();
		hlpq.Enqueue(item);
		while(hlpq.size()>0) {
			q.Enqueue(hlpq.Dequeue());
		}
		return item;
	}
//	public void display() {
//		for(int i=0;i<size();i++) {
//			int j=(front+i)%arr.length;
//			System.out.print(arr[j]+" ");
//		}
//		System.out.println();
//	}
	public static void main(String[] args)throws Exception {
		Stack_using_Queue st= new Stack_using_Queue();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		st.push(60);
		System.out.println(st.pop());
		st.push(70);
		st.push(80);
		System.out.println(st.peek());
	}
	
}
