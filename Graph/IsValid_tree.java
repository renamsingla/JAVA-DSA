package Graph;

import java.util.*;

public class IsValid_tree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int[][]edges= {{0,1},{1,2},{2,3},{1,3},{1,4}};
		
		HashMap<Integer, List<Integer>>hm= new HashMap<>();
		
		for(int i=0;i<n;i++) {
			hm.put(i, new ArrayList<>());
		}
		
		for(int i=0;i<edges.length;i++) {
			int v1= edges[i][0];
			int v2= edges[i][1];
			
			hm.get(v1).add(v2);
			hm.get(v2).add(v1);
		}
		
		Stack<Integer> st= new Stack<>();
		HashSet<Integer> set= new HashSet<>();
		
		int count=0;
		
		for(int key: hm.keySet()) {
			if(set.contains(key)) {
				continue;
			}
			count++;
			st.push(key);
			
			while(!st.isEmpty()) {
				int item= st.pop();
				
				if(set.contains(item)) {
					System.out.println("false- cycle exists");
					return;
				}
				
				set.add(item);
				
				
				
				for(int nbrs: hm.get(item)) {
					if(!set.contains(nbrs)) {
						st.push(nbrs);
					}
				}
			}
	
		}
		if(count==1) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	}

}
