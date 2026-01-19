package Stack;

public class stack {

	protected int[]arr; //private array so everyone cannot access it
	private int idx=-1; //index pointer for stack
	
	public stack() {
//		default constructor
		arr= new int[5]; //defining the size of the array
		
	}
	
	public stack(int n) {
//		another constructor
//		the size of the array is passed to us
		arr= new int[n]; //static stack with the limit on size
	}
	
	public void push(int num) throws Exception{
		if(isFull()) {
			throw new Exception("stack is full");
		}
		idx++;
		arr[idx]=num;
		
	}
	
	public boolean isEmpty() {
		if(idx==-1) {
			return true;
		}
		return false;
	}
	
	public int pop() throws Exception{
		if(isEmpty()) {
			throw new Exception("stack is empty");
		}
		int item= arr[idx];
		idx--;
		return item;
	}
	public int size() {
		return idx+1;
	}
	public boolean isFull() {
		if(idx+1==arr.length) {
			return true;
		}
		return false;
	}
	public int peek()throws Exception {
		if(isEmpty()) {
			throw new Exception("stack is empty");
		}
		return arr[idx];
	}
	public void display() {
		for(int i=0;i<=idx;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
