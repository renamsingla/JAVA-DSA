package Practice_Graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class Cycle_bfs_dfs_detection {
	
	HashMap<Integer, List<Integer>> map;
	
	public Cycle_bfs_dfs_detection(int n) {
		map= new HashMap<>();
		for(int i=1;i<=n;i++) {
			map.put(i,new ArrayList<>());
		}
	}
	
	public void AddEdge(int v1, int v2) {
		map.get(v1).add(v2);
		map.get(v2).add(v1);
	}
	
	public void display() {
		for(int key: map.keySet()) {
			System.out.println(key+"-"+map.get(key));
		}
	}
	
	public boolean cycleBFS() {
		HashSet<Integer>visited= new HashSet<>();
		Queue<Integer>q= new LinkedList<>();
		q.add(1);
		
		while(!q.isEmpty()) {
			int item= q.poll();
			
			if(visited.contains(item)) {
				System.out.println("cycle at: "+ item);
				return true;
			}
			
			visited.add(item);
			
			for(int key: map.get(item)) {
				if(!visited.contains(key)) {
					q.add(key);
				}
			}
		}
		return false;
	}
	
	public boolean cycleDFS() {
		HashSet<Integer>visited= new HashSet<>();
		Stack<Integer>st= new Stack<>();
		st.push(1);
		
		while(!st.isEmpty()) {
			int item= st.pop();
			
			if(visited.contains(item)) {
				System.out.println("cycle at: "+ item);
				return true;
			}
			
			visited.add(item);
			
			for(int key:map.get(item)) {
				if(!visited.contains(key)) {
					st.add(key);
				}
			}
		}
		return false;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cycle_bfs_dfs_detection cy= new Cycle_bfs_dfs_detection(7);
		
		cy.AddEdge(1, 2);
		cy.AddEdge(2, 5);
		cy.AddEdge(5, 7);
//		cy.AddEdge(7, 6);
		cy.AddEdge(6, 5);
		cy.AddEdge(5, 3);
		cy.AddEdge(3, 4);
		cy.AddEdge(4, 1);
		
		cy.display();
		
		System.out.println(cy.cycleDFS());
		System.out.println(cy.cycleBFS());

	}

}
