package Practice_Graph;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Path_exists {
	
	HashMap<Integer, HashMap<Integer,Integer>>map;
	
	public Path_exists(int n) {
		map= new HashMap<>();
		for(int i=1;i<=n;i++) {
			map.put(i,  new HashMap<>());
		}
	}
	
	public void AddEdge(int v1, int v2, int cost) {
		map.get(v1).put(v2, cost);
		map.get(v2).put(v1, cost);
	}
	
	public void display() {
		for(int key: map.keySet()) {
			System.out.println(key+" -"+ map.get(key));
		}
	}
	
//	DFS
	public boolean pathDFS(int src, int des) {
		Stack<Integer>st= new Stack<>();
		st.push(src);
		
		HashSet<Integer> visited= new HashSet<>();
		
		while(!st.isEmpty()) {
			int item= st.pop();
			if(visited.contains(item)) {
				continue;
			}
			visited.add(item);
			
//			self work
			if(item==des) {
				return true;
			}
			
			for(int key: map.get(item).keySet()) {
				if(!visited.contains(key)) {
					st.push(key);
				}
			}
		}
		return false;
	}
	
	public boolean pathBFS(int src, int des) {
		HashSet<Integer>set= new HashSet<>();
		Queue<Integer>q= new LinkedList<>();
		q.add(src);
		
		while(!q.isEmpty()) {
			int item= q.poll();
			
			if(set.contains(item)) {
				continue;
			}
			
			set.add(item);
			
			if(item==des) {
				return true;
			}
			
			for(int key:map.get(item).keySet()) {
				if(!set.contains(key)) {
					q.add(key);
				}
			}
		}
		return false;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Path_exists p= new Path_exists(7);
		p.AddEdge(1, 2, 5);
//		p.AddEdge(2, 5, 8);
		p.AddEdge(5, 7, 2);
		p.AddEdge(7, 6, 10);
		p.AddEdge(6, 5, 9);
//		p.AddEdge(5, 3, 9);
		p.AddEdge(3, 4, 7);
		p.AddEdge(4, 1, 3);
		
		p.display();
		
		System.out.println(p.pathBFS(1, 6));
		System.out.println(p.pathDFS(1, 6));

	}

}
