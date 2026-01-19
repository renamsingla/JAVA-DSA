package Practice_Graph;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class Shortest_path_bfs{
	HashMap<Integer, HashMap<Integer,Integer>>map;
	
	public Shortest_path_bfs(int n) {
		map= new HashMap<>();
		for(int i=1;i<=n;i++) {
			map.put(i, new HashMap<>());
		}
	}
	
	public void AddEdge(int v1, int v2) {
		map.get(v1).put(v2,  0);
		map.get(v2).put(v1,  0);
	}
	
	public void display() {
		for(int key: map.keySet()) {
			System.out.println(key+" -"+ map.get(key));
		}
	}
	
	public String path(int src, int dest) {
		String str="";
		Queue<Integer>q= new LinkedList<>();
		HashSet<Integer>visited= new HashSet<>();
		q.add(src);
		
		while(!q.isEmpty()) {
			int item= q.poll();
			
			if(visited.contains(item)) {
				continue;
			}
			
			visited.add(item);
			
			str+=item;
			if(item==dest) {
				return str;
			}
			
			for(int key:map.get(item).keySet()) {
				if(!visited.contains(key)) {
					q.add(key);
				}
			}
		}
		return "does not exists";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shortest_path_bfs sb= new Shortest_path_bfs(7);
		sb.AddEdge(1, 2);
		sb.AddEdge(2, 5);
		sb.AddEdge(5, 7);
		sb.AddEdge(7, 6);
		sb.AddEdge(6, 5);
		sb.AddEdge(5, 3);
		sb.AddEdge(3, 4);
		sb.AddEdge(4, 1);
		
		sb.display();
		
		System.out.println(sb.path(1,4));

	}

}
