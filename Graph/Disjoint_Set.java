package Graph;

import java.util.*;

public class Disjoint_Set {
	
	class node{
		int data;
		int rank;
		node parent;
	}
	
	private HashMap<Integer,node>map= new HashMap<>();
	
	public void createSet(int v) {
		node n= new node();
		n.data=v;
		n.rank=0;
		n.parent=n;
		map.put(v, n);
	}
	
	public int findSet(int v) {
		node self= map.get(v);
		return find(self).data;
	}
	
//	log(n)
	private node find(node n) {
		if(n.parent==n) {
			return n;
		}
		node nn= find(n.parent);
		n.parent=nn; //path compression, after a point the TC will be O(1)
		return nn;
	}
	
	public void Union (int v1, int v2) {
		node n1= map.get(v1);
		node n2= map.get(v2);
		
		node rn1= find(n1);
		node rn2= find(n2);
		
		if(rn1.rank==rn2.rank) {
			rn2.parent=rn1; //rn1 will be the new parent of rn2
			rn1.rank++;
		}else if(rn1.rank> rn2.rank) {
			rn2.parent= rn1;
		}else {
			rn1.parent= rn2;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
