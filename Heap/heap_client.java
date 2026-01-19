package Heap;

public class heap_client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		heap h= new heap();
		h.add(10);
		h.add(20);
		h.add(30);
		h.add(1);
		h.add(5);
		h.add(7);
		h.add(3);
		h.add(2);
		h.add(-4);
		
		h.display();
		h.remove();
		h.display();

	}

}
