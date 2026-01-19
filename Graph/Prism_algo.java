package Graph;

import java.util.*;

public class Prism_algo {
	HashMap<Integer, HashMap<Integer,Integer>>hm;
	
	public Prism_algo(int v) {
		hm= new HashMap<>();
		
		for(int i=1;i<=v;i++) {
			hm.put(i,new HashMap<>());
		}
	}
	
	public void AddEdge(int v1, int v2, int cost) {
		hm.get(v1).put(v2, cost);
		hm.get(v2).put(v1, cost);
	}
	
	class PrismPair{
		int v;
		int acqv;
		int cost;
		
		public PrismPair(int v, int acqv, int cost) {
			this.v= v;
			this.acqv=acqv;
			this.cost=cost;
		}
		
		public String toString() {
			return v+"-"+acqv+"@"+cost;
		}
	}
	
	public int prims() {
//		comparator for minimum heap
		PriorityQueue<PrismPair>pq= new PriorityQueue<>(new Comparator<PrismPair>() {

			@Override
			public int compare(PrismPair o1, PrismPair o2) {
				// TODO Auto-generated method stub
				return o1.cost-o2.cost;
			}
			
		});
		
			HashSet<Integer>visited= new HashSet<>();
			
			pq.add(new PrismPair(1,1,0));
			
			int sum=0;
			while(!pq.isEmpty()) {
				PrismPair pp=pq.remove();
				
				if(visited.contains(pp.v)) {
					continue;
				}
				
				visited.add(pp.v);
				
				System.out.println(pp);
				sum+=pp.cost;
				
				for(int v: hm.get(pp.v).keySet()) {
					if(!visited.contains(v)) {
						int cost= hm.get(pp.v).get(v);
						pq.add(new PrismPair(v,pp.v,cost));
					}
				}
				
			}
			return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		
		int n= s.nextInt();
		Prism_algo p= new Prism_algo(n);
		
		int m= s.nextInt();
		
		for(int i=1;i<=m;i++) {
			int v1= s.nextInt();
			int v2= s.nextInt();
			int cost=s.nextInt();
			p.AddEdge(v1, v2, cost);
		}
		
		System.out.println(p.prims());
	}

}
