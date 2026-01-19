package Graph;

import java.util.HashMap;
import java.util.*;

public class graph {
	
	HashMap <Integer, HashMap<Integer,Integer>> hm;
	
	public graph(int v) { //v is number of vertex
		hm= new HashMap<>();
		 
		for(int i=1;i<=v;i++) {  //we are starting from 1 because first vertex is 1
			hm.put(i, new HashMap<>());		
		}
	}
	
	public void addEdge(int v1, int v2,int cost) {
		hm.get(v1).put(v2, cost);
		hm.get(v2).put(v1,cost);
	}
	
//	is there a edge between two vertex or not
	public boolean hasEdge(int v1, int v2) {
		return hm.get(v1).containsKey(v2); 
	}
	
//	tell the total number of edge
	public int NoofEdge() {
		int sum=0;
		for(int key: hm.keySet()) {
			sum+=hm.get(key).size();
		}
		return sum/2;
	}
	
//	add vertex
	public void addVertex(int v) {
		hm.put(v, new HashMap<>());
	}
	
//	remove an edge in between two vertex
	public void removeEdge(int v1, int v2) {
		hm.get(v1).remove(v2);
		hm.get(v2).remove(v1);
	}
	
//	remove a vertex from the graph
	public void removeVertex(int v) {
		for(int key: hm.get(v).keySet()) {
			hm.get(key).remove(v);
		}
		hm.remove(v); 
	}
	
	public void display() {
		for(int key:hm.keySet()){
			System.out.println(key+" "+ hm.get(key));
		}
	}
	
//	find if a path exists or not
	public boolean hasPath(int v1, int v2, HashSet<Integer>visited) {
		if(v1==v2) {
			return true;
		}
		visited.add(v1);
		for(int key: hm.get(v1).keySet()) {
			if(!visited.contains(key)) {
				boolean ans=hasPath(key,v2, visited);
				if(ans) {
					return true;
				}
			}
		}
		return false;
	}
	
//	print all path
	public void printPath(int v1, int v2, HashSet<Integer>visited, String str) {
		if(v1==v2) {
			System.out.println(str+v1);
			
			return;
		}
		visited.add(v1);
		
		for(int key: hm.get(v1).keySet()) {
			if(!visited.contains(key)) {
				printPath(key,v2, visited,str+v1);
			}
		}
		visited.remove(v1);
	}
	
//	BFS
	public boolean BFS( int v1, int v2) {
		Queue<Integer> q= new LinkedList<>();
		q.add(v1);
		
		HashSet<Integer>visited= new HashSet<>();
		
		while(!q.isEmpty()) {
//			remove
			int item=q.poll();
			
//			ignore
			if(visited.contains(item)) {
				continue;
			}
			
//			mark visited
			visited.add(item);
			
//			self work
			if(item==v2) {
				return true;
			}
			
//			add neighbours
			for(int key: hm.get(item).keySet()) {
				if(!visited.contains(key)) {
					q.add(key);
				}
			}
		}
		return false;
	} 
	
	
//	DFS
	public boolean DFS(int v1, int v2) {
		Stack<Integer> st= new Stack<>();
		st.push(v1);
		
		HashSet<Integer> visited= new HashSet<>();
		
		while(!st.isEmpty()) {
			int item=st.pop();
			
			if(visited.contains(item)) {
				continue;
			}
			
			visited.add(item);
			
			if(item==v2) {
				return true;
			}
			
			for(int key: hm.get(item).keySet()) {
				if(!visited.contains(key)) {
					st.push(key);
				}
			}
		}
		return false;
	}
}
