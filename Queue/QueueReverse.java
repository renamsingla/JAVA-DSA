package Queue;

public class QueueReverse {
	
	public static void reverse (Queue q) throws Exception {
		if(q.isEmpty()) {
			return;
		}
		int x= q.Dequeue();
		reverse(q);
		q.Enqueue(x);
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Queue q= new Queue();
		
		q.Enqueue(10);
		q.Enqueue(20);
		q.Enqueue(30);
		q.Enqueue(40);
		
		q.display();
		reverse(q);
		q.display();
	}

}
