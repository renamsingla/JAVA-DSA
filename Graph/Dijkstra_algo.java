package Graph;

import java.util.*;

public class Dijkstra_algo {
	
	HashMap<Integer,HashMap<Integer,Integer>>map;
	
	public Dijkstra_algo(int v) {
		map= new HashMap<>();
		for(int i=1;i<=v;i++) {
			map.put(i, new HashMap<>());
		}
	}
	
	public void AddEdge(int v1, int v2, int cost) {
		map.get(v1).put(v2,cost);
		map.get(v2).put(v1,cost);
	}
	
	class DijkstraPair{
		int v;
		String path;
		int cost;
		
		public DijkstraPair(int v, String path, int cost) {
			this.v= v;
			this.path= path;
			this.cost= cost;
		}
		
		public String toString() {
			return v+"-"+path+"@"+cost;
		}
		
	}
	
	public void dijkstra(int src) {
		PriorityQueue<DijkstraPair> pq= new PriorityQueue<>(new Comparator<DijkstraPair>() {

			@Override
			public int compare(DijkstraPair o1, DijkstraPair o2) {
				// TODO Auto-generated method stub
				return o1.cost-o2.cost;
			}
			
		});
		HashSet<Integer> visited= new HashSet<>();
		pq.add(new DijkstraPair(src,""+src,0));
		
		while(!pq.isEmpty()) {
			DijkstraPair p= pq.poll();
			 
			if(visited.contains(p.v)) {
				continue;
			}
			
			visited.add(p.v);
			
			System.out.println(p);
			
			for(int nbrs: map.get(p.v).keySet()) {
				if(!visited.contains(nbrs)) {
					int cost= map.get(p.v).get(nbrs);
					pq.add(new DijkstraPair(nbrs,p.path+nbrs,p.cost+cost));
				}
			}
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		Dijkstra_algo dj= new Dijkstra_algo(n);
		
		int m= s.nextInt();
		for(int i=1;i<=m;i++) {
			int v1= s.nextInt();
			int v2= s.nextInt();
			int cost=s.nextInt();
			dj.AddEdge(v1, v2, cost);
		}
//		dj.AddEdge(1, 4, 6);
//		dj.AddEdge(1, 2, 10);
//		dj.AddEdge(2, 3, 7);
//		dj.AddEdge(3, 4, 5);
//		dj.AddEdge(4, 5, 1);
//		dj.AddEdge(5, 6, 4);
//		dj.AddEdge(7, 5, 2);
//		dj.AddEdge(6, 7, 3);
		dj.dijkstra(1);
	}

}
