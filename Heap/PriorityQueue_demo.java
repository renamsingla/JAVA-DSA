package Heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueue_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		PriorityQueue<Integer> h= new PriorityQueue<>(); // min heap 
		PriorityQueue<Integer> h= new PriorityQueue<>(Collections.reverseOrder()); //max heap
		
		h.add(10);
		h.add(20);
		h.add(30);
		h.add(1);
		h.add(5);
		h.add(7);
		h.add(3);
		h.add(2);
		h.add(-4);
		
		
		
		System.out.println(h);
	}

}
