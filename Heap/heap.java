package Heap;

import java.util.ArrayList;

public class heap {
	
	private ArrayList<Integer>ll= new ArrayList<>();
	
	public void add(int item) {
		ll.add(item);
		upheapify(ll.size()-1);
	}
	
	private void upheapify(int ci) {
		int pi= (ci-1)/2;
		if(ll.get(pi)>ll.get(ci)) {
			swap(pi,ci);
			upheapify(pi); //recursion to check now the swapped ci and pi needs more swapping or not
		}
		
	}
	
	private void swap(int pi, int ci) {
		int p= ll.get(pi);
		int c= ll.get(ci);
		ll.set(pi, c);
		ll.set(ci, p);
	}
	
	public int remove() { //remove will always be from 0th index
		swap(0,ll.size()-1); //so the removal will always be from last of array-list
		int item= ll.remove(ll.size()-1);
		downheapify(0);
		return item;
	} 
	
	private void downheapify(int pi) {
		int lci= 2*pi+1;
		int rci= 2*pi+2;
		
		int min=pi;
		if(rci<ll.size() && ll.get(min)>ll.get(rci)) {
			min=rci;
		}
		if(lci<ll.size() && ll.get(min)>ll.get(lci)) {
			min=lci;
		}
		
		if(min!=pi) {
			swap(min,pi);
			downheapify(min);
		}
	}
	
	public int get() {
		return ll.get(0);
	}
	
	public int size() {
		return ll.size();
	}
	
	public void display() {
		System.out.println(ll);
	}
	
	

}
