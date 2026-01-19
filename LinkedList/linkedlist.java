package LinkedList;

public class linkedlist {
	
	class node{
		int data;
		node next;
	}
	
	private node head;
	private node tail;
	private int size;
	
//	O(1)
	public void AddFirst(int item) {
		node n= new node(); //we created a node object
		n.data= item; //for that obj n , we added the data provided as an item
		
		if(size==0) { //the size of the linked list is 0
			head=n;
			tail=n;
			size++;
		}else {      //if we already have nodes in ll, and we are adding one at start(head)
			n.next=head; //the next of this node is now storing the address of the last head
			head=n; //now head is pointing to the newly created node
			size++; 
		}
	}
	
//	O(1)
	public void AddLast(int item) {
		
		if(size==0) {
			AddFirst(item);
		}else {
			node n= new node();
			n.data=item;
			tail.next=n;
			tail=n;
			size++;
		}
	}
	
//	0(N) -- GetNode() has a loop
	public void AddIndex(int item, int k) {
		if(k==0) {
			AddFirst(item);
		}else if(k==size) {
			AddLast(item);
		}else {
			node n= new node();
			n.data=item;
			node prevk= GetNode(k-1);
			n.next=prevk.next;
			prevk.next=n;
			size++;
		}
	}
//	0(1)
	public int GetFirst() {
		return head.data;
	}
//	O(1)
	public int GetLast() {
		return tail.data;
	}
//	0(N)
	public int GetIndex(int k) {
		return GetNode(k).data;
	}
	
//	0(1)
	public int RemoveFirst() {
		int item= head.data;
		if(size==1) {
			head=null;
			tail=null;
			
		}else {
			node temp=head.next;
			head.next=null;
			head=temp;
			
		}
		size--;
		return item;
	}
	
//	O(N)
	public int RemoveLast() {
//		int item=tail.data;
		if(size==1) {
			return RemoveFirst();
		}else {
			int rv = tail.data;
			node sl = GetNode(size - 2);
			sl.next = null;
			tail = sl;
			size--;
			return rv;
		}
	}
	
//	0(N)
	public int RemoveIndex(int k) {
		if(k==0) {
			return RemoveFirst();
		}else if(k==size-1) {
			return RemoveLast(); 
		}else {
//			Node K_1th = GetNode(k - 1);
//			Node kth = K_1th.next;
//			K_1th.next = kth.next;
//			kth.next = null;
//			size--;
//			return kth.data;
			node temp= GetNode(k-1);	
			int item= temp.next.data;
			temp.next= temp.next.next;
			temp.next.next=null;
			size--;
			return item;
		}
	}
	
//	0(N)
	public void Display() {
		node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+"-->");
			temp=temp.next;
		}
		System.out.println(".");
	}
	
//	0(N)
	private node GetNode(int k) {
		node temp=head;
		for(int i=0;i<k;i++) {
			temp=temp.next;
		}
		return temp;
	}

}
