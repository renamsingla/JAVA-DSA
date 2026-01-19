package Practice_Graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class leetcode3607 {
	
	HashMap<Integer, List<Integer>>hm;
	HashSet<Integer>active;
	
	public leetcode3607(int n) { //constructor
		hm= new HashMap<>();
		active= new HashSet<>();
		for(int i=1;i<=n;i++) {
			active.add(i);
			hm.put(i, new ArrayList<>());
		}
	}
	
	public void addEdge( int v1, int v2) {
		hm.get(v1).add(v2);
		hm.get(v2).add(v1);
	}
	
	
	public void powerGrid(ArrayList<Integer>arr, int[][]queries, int i) {
		
			HashSet<Integer>visited= new HashSet<>();
			Queue<Integer>st = new LinkedList<>();
			
			if(queries[i][0]==1) {
				if(active.contains(queries[i][1])) {
					arr.add(queries[i][1]);
				}else {
					int min= Integer.MAX_VALUE;
					st.add(queries[i][1]);

					while(!st.isEmpty()) {
						int item= st.poll();
						
						if(visited.contains(item)) {
							continue;
						}
						visited.add(item);
						
						if(active.contains(item)) {
							min= Math.min(min, item);
						}
						
						for(int nbrs: hm.get(item)) {
							if(!visited.contains(nbrs)) {
								st.add(nbrs);
							}
						}
					}
					if(min==Integer.MAX_VALUE) {
						arr.add(-1);
					}else {
						arr.add(min);
					}
				}
				
			}else if(queries[i][0]==2) {
				active.remove(queries[i][1]);
			}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c= 5;
		int[][]connections= {{1,2},{2,3},{3,4},{4,5}};
		int[][]queries= {{1,3},{2,1},{1,1},{2,2},{1,2}};
//		int c= 3;
//		int[][]connections= {};
//		int[][]queries= {{1,1},{2,1},{1,1}};
		ArrayList<Integer> arr= new ArrayList<>();
		
		leetcode3607 lc= new leetcode3607(c);
		
		for(int i=0;i<connections.length;i++) {
			int v1= connections[i][0];
			int v2= connections[i][1];
			lc.addEdge(v1, v2);
		}
		
		for(int i=0;i<queries.length;i++) {
			lc.powerGrid(arr,queries,i);
		}
		
		System.out.println(arr);
		

	}

}
