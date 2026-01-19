package Hashmap;

import java.util.*;

public class hashmap_class <K,V>{
	
	class node{
		K key;
		V value;
		node next;
	}
	
	private int size=0;
	
//	array cannot be made generic, hence using array-list
	private ArrayList<node> bucket;
	
//	initialising the array-list bucket of size n with null
	public hashmap_class(int n) {
		bucket= new ArrayList<>();
		
		for(int i=0;i<n;i++) {
			bucket.add(null);
		}
		
	}
	
	public hashmap_class() {
		//here this constructor is calling the another constructor by 'this' keyword and passing parameters
		this(4); 
	}
	
//	put key value pair
	public void put(K key, V value) {
		int idx= hashFun(key);
		node temp= bucket.get(idx);
		
		while(temp!=null) {
			if(temp.key.equals(key)) { //the key already exists in hash-map
				temp.value=value; //updating the value of corresponding key
				return;
			}
			temp=temp.next;	
		}
		
		node n= new node();
		n.key=key;
		n.value=value;
		
//		getting the node at index of array-list
		temp= bucket.get(idx);
//		add first
		n.next=temp;
//		updating key at index of array-list
		bucket.set(idx, n);
		size++;
		
//		rehashing technique
		double lf= (1.0)*size/bucket.size();
		double thf= 2.0;
		if(thf<lf) {
			rehashing();
		}
		
	}
	
	private void rehashing() {
		ArrayList<node>brr= new ArrayList<>();
		for(int i=0;i<bucket.size()*2;i++) {
			brr.add(null);
		}
		ArrayList<node>old_buck=bucket;
		bucket= brr;
		size=0;
		
		for(node temp:old_buck) {
			while(temp!=null) {
				put(temp.key,temp.value);
				temp=temp.next;
			}
		}
		
	}
	
//	contains key
	public boolean containsKey(K key) {
		int idx= hashFun(key);
		node temp= bucket.get(idx);
		
		while(temp!=null) {
			if(temp.key.equals(key)) { //the key already exists in hash-map
				return true;
			}
			temp=temp.next;	
		}
		return false;
	}
	
//	get
	public V get(K key) {
		int idx= hashFun(key);
		node temp= bucket.get(idx);
		while(temp!=null) {
			if(temp.key.equals(key)) { //the key already exists in hash-map
				return temp.value;
			}
			temp=temp.next;	
		}
		return null;
	}
	
//	remove
	public V remove(K key) {
		int idx= hashFun(key);
		node curr= bucket.get(idx);
		node prev= null;
		
		while(curr!=null) {
			if(curr.key.equals(key)){
				break;
			}
			prev=curr;
			curr=curr.next;
		}
		if(curr==null) {
			return null; 
		}else if(prev==null ) {
			bucket.set(idx, curr.next);
			curr.next=null;
			size--;
		
		}else {
			prev.next= curr.next;
			curr.next=null;
			size--;
		}
		
		return curr.value;
	}
	
//	to know in which bucket the key value pair will go
	public int hashFun(K key) {
		int n= key.hashCode()%bucket.size(); 
		
		if(n<0) {
			 n+=bucket.size(); //n will become positive
		}
		return n;
	}
	
	public String toString() {
		String s="{";
		for(node temp:bucket) {
			while(temp!=null) {
				s=s+ temp.key+"="+temp.value+", "; 
				temp=temp.next;
			}
		}
		s=s.trim();
		return s+"}";
	}
	

}
