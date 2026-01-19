package Graph;

import java.util.*;

public class traversal_graph {
	
	HashMap<Integer, HashMap<Integer,Integer>>hm;
	
	public traversal_graph(int v) {
		hm= new HashMap<>();
		for(int i=1;i<=v;i++) {
			hm.put(i, new HashMap<>());
		}
	}
	
	public void addEdge(int v1, int v2, int cost) {
		hm.get(v1).put(v2, cost);
		hm.get(v2).put(v1, cost);
	}
	
	public void BFT() {
		Queue<Integer> q= new LinkedList<>();
		HashSet<Integer> set= new HashSet<>();
		
		
		for(int key: hm.keySet()) {
			if(set.contains(key)) {
				continue;
			}
			q.add(key);
			
			while(!q.isEmpty()) {
				int item= q.remove();
				
				if(set.contains(item)) {
					continue;
				}
				
				set.add(item);
				
				System.out.print(item+" ");
				
				for(int nbrs: hm.get(item).keySet()) {
					if(!set.contains(nbrs)) {
						q.add(nbrs);
					}
				}
			}
			
		}
		System.out.println();
	}
	
	public void DFT() {
		Stack<Integer> st= new Stack<>();
		HashSet<Integer> set= new HashSet<>();
		
		
		for(int key: hm.keySet()) {
			if(set.contains(key)) {
				continue;
			}
			st.push(key);
			
			while(!st.isEmpty()) {
				int item= st.pop();
				
				if(set.contains(item)) {
					continue;
				}
				
				set.add(item);
				
				System.out.print(item+" ");
				
				for(int nbrs: hm.get(item).keySet()) {
					if(!set.contains(nbrs)) {
						st.push(nbrs);
					}
				}
			}
	
		}
		System.out.println();
	}
	
	public static void main(String[]args) {
		traversal_graph g= new traversal_graph(7);
		
		g.addEdge(1, 4, 5);
		g.addEdge(1, 2, 3);
		g.addEdge(2, 1, 3);
		g.addEdge(2, 3, 4);
		g.addEdge(3, 2, 4);
		g.addEdge(3, 4, 2);
		g.addEdge(4, 1, 5);
		g.addEdge(4, 3, 2);
		g.addEdge(4, 5, 6);
		g.addEdge(5, 4, 6);
		g.addEdge(5, 6, 1);
		g.addEdge(5, 7, 8);
		g.addEdge(6, 5, 1);
		g.addEdge(6, 7, 4);
		g.addEdge(7, 6, 4);
		g.addEdge(7, 5, 8);
		
		g.BFT();
		g.DFT();
	}

}
