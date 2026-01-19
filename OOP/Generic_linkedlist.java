package OOP;

public class Generic_linkedlist <T>{
	
//	public class linkedlist {
		
		class node{
			T data;
			node next;
		}
		
		private node head;
		private node tail;
		private int size;
		
//		O(1)
		public void AddFirst(T item) {
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
		
//		O(1)
		public void AddLast(T item) {
			
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
		
//		0(N) -- GetNode() has a loop
		public void AddIndex(T item, int k) {
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
//		0(1)
		public T GetFirst() {
			return head.data;
		}
//		O(1)
		public T GetLast() {
			return tail.data;
		}
//		0(N)
		public T GetIndex(int k) {
			return GetNode(k).data;
		}
		
//		0(1)
		public T RemoveFirst() {
			T item= head.data;
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
		
//		O(N)
		public T RemoveLast() {
			T item=tail.data;
			if(size==0) {
				return RemoveFirst();
			}else {
				tail= GetNode(size-2);
				tail.next=null;
			}
			size--;
			return item;
		}
		
//		0(N)
		public T RemoveIndex(int k) {
			if(k==0) {
				return RemoveFirst();
			}else if(k==size-1) {
				return RemoveLast(); 
			}else {
				node temp= GetNode(k-1);	
				T item= temp.next.data;
				temp.next= temp.next.next;
				temp.next.next=null;
				size--;
				return item;
			}
		}
		
//		0(N)
		public void Display() {
			node temp=head;
			while(temp!=null) {
				System.out.print(temp.data+"-->");
				temp=temp.next;
			}
			System.out.println(".");
		}
		
//		0(N)
		private node GetNode(int k) {
			node temp=head;
			for(int i=0;i<k;i++) {
				temp=temp.next;
			}
			return temp;
	}

	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Generic_linkedlist<String> gll= new Generic_linkedlist<>();
		
		gll.AddFirst("kaju");
		gll.AddFirst("abc");
		gll.AddFirst("renam");
		gll.AddFirst("xyz");
		gll.Display();

	}

}
