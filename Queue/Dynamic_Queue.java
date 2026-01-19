package Queue;

public class Dynamic_Queue extends Queue{
	
	public void Enqueue(int item) throws Exception {
		if(isFull()) {
			int[]brr= new int[2*arr.length];
			for(int i=0;i<arr.length;i++) {
				int idx=(front+i)%arr.length;
				brr[i]=arr[idx];
			}
			arr= brr;
			front=0;
		}
		super.Enqueue(item);
	}
	
	public static void main(String[] args) throws Exception {
		Dynamic_Queue dq= new Dynamic_Queue();
		dq.Enqueue(10);
		dq.Enqueue(20);
		dq.Enqueue(30);
		dq.Enqueue(40);
		dq.Enqueue(50);
		dq.Dequeue();
		dq.Dequeue();
		dq.Enqueue(60);
		dq.Enqueue(70);
		dq.Enqueue(80);
		dq.Enqueue(90);
		dq.display();
		
	}
}
