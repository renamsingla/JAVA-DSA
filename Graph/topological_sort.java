package Graph;

import java.util.*;

public class topological_sort {
	
	HashMap<Integer, HashMap<Integer,Integer>>map;
	
	public topological_sort(int v) {
		map= new HashMap<>();
		
		for(int i=1;i<=v;i++) {
			map.put(i, new HashMap<>());
		}
	}
	
	public void AddEdge(int v1, int v2) {
		map.get(v1).put(v2, 0);
	}
	
	public int[] inDegree() {
		int[]arr= new int[map.size()+1];
		for(int key:map.keySet()) {
			for(int nbrs : map.get(key).keySet()) {
				arr[nbrs]++;
			}
		}
		return arr;
	}
	
	public int topological() {
		Queue<Integer> q= new LinkedList<>();
		int count=0;
		int[]ind= inDegree();
		
		for(int i=1;i<ind.length;i++) {
			if(ind[i]==0) {
				q.add(i);
				count++;
			}
		}
		
		while(!q.isEmpty()) {
			int item= q.poll();
			System.out.print(item+" ");
			
			for(int nbrs: map.get(item).keySet()) {
				ind[nbrs]--;
				if(ind[nbrs]==0) {
					q.add(nbrs);
					count++;
				}
			}
			
			
		}
		System.out.println();
		return count; //for cycle detection
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		topological_sort ts= new topological_sort(7);
		
		ts.AddEdge(1, 2);
		ts.AddEdge(1, 4);
//		ts.AddEdge(3, 1);
		ts.AddEdge(4, 3);
		ts.AddEdge(3, 2);
		ts.AddEdge(4, 5);
		ts.AddEdge(5, 7);
		ts.AddEdge(6, 3);
		ts.AddEdge(6, 7);
		
		int count=ts.topological();
		System.out.println(count);
	}

}
