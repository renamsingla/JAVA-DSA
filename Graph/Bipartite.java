package Graph;

import java.util.*;

public class Bipartite {
	static class pair{
		int v;
		int d;
		
		public pair(int v, int d) {
			this.v=v;
			this.d=d;
		}
	}
	
	public static boolean solution() {
		int[][]graph= {{1,2,3},{0,2},{0,1,3},{0,2}};
		
		HashMap<Integer, Integer>visited= new HashMap<>();
		Queue<pair>q= new LinkedList<>();
		
		for(int key=0;key<graph.length;key++) { //going to each vertex
			if(visited.containsKey(key)) {
				continue;
			}
			q.add(new pair(key,0));
			
			while(!q.isEmpty()) {
				pair item= q.poll();
				
				if(visited.containsKey(item.v)) {
					if(item.d!=visited.get(item.v)) {
						return false;
					}
					continue;
				}
				
				visited.put(item.v,item.d);
				
				for(int nbrs:graph[item.v]) {
					if(!visited.containsKey(nbrs)) {
						q.add(new pair(nbrs,item.d+1));
					}
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution());
		
	}

}
