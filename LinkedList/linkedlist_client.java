package LinkedList;

public class linkedlist_client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		linkedlist ll= new linkedlist();
		ll.AddFirst(10);
		ll.AddFirst(20);
		ll.AddFirst(30);
		ll.AddFirst(40);
		ll.AddLast(80);
		ll.AddIndex(-9, 2);
		ll.Display();
		System.out.println(ll.GetFirst());
		System.out.println(ll.GetLast());
		System.out.println(ll.GetIndex(2));
		System.out.println(ll.RemoveFirst());
		ll.Display();
		System.out.println(ll.RemoveLast());
		ll.Display();
		System.out.println(ll.RemoveIndex(2));
		ll.Display();
		System.out.println(ll); //this gives address

	}

}
