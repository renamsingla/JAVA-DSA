package Tree;

import Tree.BinaryTree.node;

public class BST_using_Inorder {
	
	class node{
		int val;
		node left;
		node right;
	}
	
	private node root;
	
	public BST_using_Inorder(int[]arr) { //constructor
		root = createTree(arr,0,arr.length-1);
	}
	
	private node createTree(int[]arr, int i, int j) {
		if(i>j)return null;
		
		int mid=(i+j)/2;
		node n= new node();
		n.val=arr[mid];
		
		n.left= createTree(arr, i,mid-1);
		n.right=createTree(arr, mid+1,j);
		return n;
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
	
	
	public static void main(String[]args) {
		int[]arr= {10,20,30,40,50,60,70,80};
		BST_using_Inorder bst= new BST_using_Inorder(arr);
		bst.display();
	}

}
