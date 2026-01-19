package LinkedList;

public class Cycle_Removal {

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
	
	public void CreateCycle() {
		node n= GetNode(2);
		tail.next=n;
	}
	
//	O(N^2)
	public void CycleRemove1() {
		node cycle= hasCycle();
		if(cycle==null)return;
		
		node start=head;
		while(start!=null) {
			node temp=cycle;
			while(temp.next!=cycle) {
				if(temp.next==start) {
					temp.next=null;
					return;
				}
				temp=temp.next;
			}
			start=start.next;
		}
		
	}
	
//	O(N)
	public void CycleRemove2() {
		node cycle= hasCycle();
		if(cycle==null)return;
		
//		cycle length
		node temp=cycle;
		int count=1;
		while(temp.next!=cycle) {
			count++;
			temp=temp.next;
		}
		
//		fast covering cycle length
		node fast=head;
		for(int i=0;i<count;i++) {
			fast=fast.next;
		}
		node slow=head;
		while(slow.next!=fast.next) {
			slow=slow.next;
			fast=fast.next;
		}
		fast.next=null;
	}
	
	public void floyedCycleRemoval() {
		node cycle= hasCycle();
		if(cycle==null)return;
		
		node fast=cycle;
		node slow=head;
		while(slow.next!=fast.next) {
			slow=slow.next;
			fast=fast.next;
		}
		fast.next=null;
		
	}
	
	
	public node hasCycle() {
		node slow=head;
		node fast=head;
		while(fast!=null && fast.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
			if(slow==fast) return slow;
		}
		return null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cycle_Removal cr= new Cycle_Removal();
		cr.AddLast(1);
		cr.AddLast(2);
		cr.AddLast(3);
		cr.AddLast(4);
		cr.AddLast(5);
		cr.AddLast(6);
		cr.AddLast(7);
		cr.AddLast(8);
		cr.CreateCycle();
//		cr.CycleRemove2();
		cr.floyedCycleRemoval();
		cr.Display();
	}

}
