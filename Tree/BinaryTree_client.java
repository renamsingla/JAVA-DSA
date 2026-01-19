package Tree;

public class BinaryTree_client {
//	10 true 20 true 70 false false false true 50 false true 80 false false

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree bt= new BinaryTree();  //binary tree object is created and it will run the constructor
		bt.display();
		System.out.println(bt.max());
		System.out.println(bt.find(51));
		System.out.println(bt.height());
		bt.preorder();
		bt.inorder();
		bt.postorder();
		bt.levelorder();

	}

}
