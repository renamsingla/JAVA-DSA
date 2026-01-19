package Tree;

import java.util.LinkedList;
import java.util.Scanner;

public class BinaryTree {
	
	class node{ //class of node and what it contains
		int val;
		node left;
		node right;
	}
	
	private node root; //this is our root node , not accessible outside
	Scanner sc= new Scanner(System.in);
	
//	binary tree constructor
	public BinaryTree() {
		root= CreateTree(); // this will create a tree and assign address of root node in root
	}
	
	private node CreateTree() {
		int item= sc.nextInt();
//		a root node node is created
		node n= new node();
		n.val=item;
		
//		check if it has left child
		boolean leftchild= sc.nextBoolean();
		if(leftchild) {
			n.left=CreateTree();  //a new subtree from that node will be created
		}
		
//		check if it has right child
		boolean  rightchild= sc.nextBoolean();
		if(rightchild) {
			n.right=CreateTree();
		}
		
		return n; //the recursion will make the tree and at end returns the address of the node
	}
	
	public void display() {
		display(root);
	}
	
	private void display(node n) {
		if(n==null) {
			return ;
		}
		String str="";
		str="<--"+n.val+"-->";
		if(n.left!=null) {
			str=n.left.val+str;
		}else {
			str="."+str;
		}
		if(n.right!=null) {
			str=str+n.right.val;
		}else {
			str=str+".";
		}
		System.out.println(str);
		display(n.left);
		display(n.right);
	}
	
//	give the maximum value of the binary tree
	public int max() {
		return max(root);
	}
	
	private int max(node n) {
		
		if(n==null) {
			return Integer.MIN_VALUE;
		}
		
		int maxl= max(n.left);
		int maxr= max(n.right);
		return Math.max(n.val,Math.max(maxl, maxr));
	}
	
//	find the item in the binary tree
	public boolean find(int item) {
		return find(root,item);
	}
	
	private boolean find(node n, int item) {
		if(n==null) {
			return false;
		}
		if(n.val==item) {
			return true;
		}
		boolean left= find(n.left,item);
		boolean right= find(n.right,item);
		return left|| right;
	}
	
//	find height of the tree
	public int height() {
		return height(root);
	}
	
	private int height(node n) {
		if(n==null) {
			return -1;
		}
		int left= height(n.left);
		int right=height(n.right);
		return Math.max(left, right)+1 ;
	}
	
	
//	pre-order traversal
	public void preorder() {
		preorder(root);
		System.out.println();
	}
	
	private void preorder(node n) {
		if(n==null) {
			return;
		}
		System.out.print(n.val+" ");
		preorder(n.left);
		preorder(n.right);
	}
	
//	in-order traversal
	public void inorder() {
		inorder(root);
		System.out.println();
	}
	
	private void inorder(node n) {
		if(n==null) {
			return;
		}
		
		inorder(n.left);
		System.out.print(n.val+" ");
		inorder(n.right);
	}
	
	
//	post-order traversal
	public void postorder() {
		postorder(root);
		System.out.println();
	}
	
	private void postorder(node n) {
		if (n==null) {
			return;
		}
		postorder(n.left);
		postorder(n.right);
		System.out.print(n.val+" ");
	}
	
//	level order traversal
	public void levelorder() {
		LinkedList<node>queue= new LinkedList<>();
		queue.add(root);
		while(!queue.isEmpty()) {
			node item= queue.remove(); //remove first
			System.out.print(item.val+" ");
			if(item.left!=null) {
				queue.add(item.left);
			}
			if(item.right!=null) {
				queue.add(item.right);
			}
		}
		System.out.println();
	}
	

}
