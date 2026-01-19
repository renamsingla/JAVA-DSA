package Tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import Tree.BinaryTree.node;

public class Create_tree_Using_levelorder {
	
	class node{
		int val;
		node right;
		node left;
		public node(int val) {
			this.val=val;
		}
	}
	
	private node root;
	
//	constructor of class
	public Create_tree_Using_levelorder() {
		createTree();
	}
	
	private void createTree() {
		Scanner sc= new Scanner(System.in);
		int data=sc.nextInt();
		
		node n= new node(data);
		root= n;
		
		Queue<node>q= new LinkedList<>();
		q.add(n);
		while(!q.isEmpty()) {
			node item= q.poll(); //remove
			int c1= sc.nextInt();
			int c2= sc.nextInt();
			
			if(c1!=-1) {
				node left= new node(c1);
				item.left=left;
				q.add(left);
			}
			if(c2!=-1) {
				node right= new node(c2);
				item.right= right;
				q.add(right);
			}
			
		}
		
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Create_tree_Using_levelorder tlo= new Create_tree_Using_levelorder();
		tlo.display();
//		10 20 30 40 50 -1 70 -1 -1 60 -1 -1 -1 -1 -1
	}

}
