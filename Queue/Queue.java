package Queue;

public class Queue {
	protected int[]arr;
	protected int front=0;
	private int size=0;
	
	public Queue() {
		arr= new int[5];
	}
	public Queue(int n) {
		arr= new int[n];
	}
	
	public boolean isEmpty() {
		return size==0;
	}
	public boolean isFull() {
		return size==arr.length;
	}
	public void Enqueue(int item) throws Exception{
		if(isFull()) {
			throw new Exception("queue is full");
		}
		int idx= (front+size)%arr.length;
		arr[idx]=item;
		size++;
	}
	public int Dequeue() throws Exception {
		if(isEmpty()) {
			throw new Exception("queue is empty");
		}
		int item= arr[front];
		front=(front+1)%arr.length;
		size--;
		return item;
	}
	public int size() {
		return size;
	}
	public int getFront() throws Exception{
		if(isEmpty()) {
			throw new Exception("queue is empty");
		}
		return arr[front];
	}
	public void display() {
		for(int i=0;i<size;i++) {
			int j=(front+i)%arr.length;
			System.out.print(arr[j]+" ");
		}
		System.out.println();
	}
	 

}
