package leetcode;

import java.util.*;

public class Number_Of_Islands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char [][] grid= {
				{'1','1','0','0','0'},
				{'1','1','0','0','0'},
				{'0','0','1','0','0'},
				{'0','0','0','1','1'}
				
		};
		int []x= {-1,1,0,0};
		int[]y= {0,0,-1,1};
		int comp=0;
		Queue<int[]>q= new LinkedList<>();
		boolean [][]visited= new boolean [grid.length][grid[0].length];
		for(int i=0;i<grid.length;i++) {
			for(int j=0;j<grid[0].length;j++) {
				
				if(grid[i][j]=='1' && visited[i][j]==false) {
					
					q.add(new int[] {i,j});
//					System.out.println(i +" "+j);
					comp=comp+1;
					while(!q.isEmpty()) {
						
						//remove
						int[]item= q.poll();
		
						//ignore
						if(visited[item[0]][item[1]]==true) {
							continue;
						}
						//visited
						visited[item[0]][item[1]]=true;
						//self work
						
						//add unvisited nbrs
						int dx= item[0];
						int dy= item[1];
						for(int k=0;k<x.length;k++) {
							int nx= x[k]+dx;
							int ny= y[k]+dy;
							if(nx>=0 && ny>=0 && nx<grid.length && ny<grid[0].length) {
								if(!visited[nx][ny] && grid[nx][ny]=='1') {
									q.add(new int[] {nx,ny});
								}
							}
						}
						
					}
				}
			}
		}
		System.out.println(comp);
	}

}
