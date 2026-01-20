package leetcode;

import java.util.*;

public class Rotting_Oranges {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]grid= {{2,1,1},{1,1,0},{0,1,1}};
		
		//directions
		int[]x= {-1,1,0,0};
		int[]y= {0,0,1,-1};
		
		//in queue we will add the cell representing array [i,j] 
		Queue<int[]>q= new LinkedList<>();
		boolean [][] visited= new boolean[grid.length][grid[0].length];
		
		for(int i=0;i<grid.length;i++) {
			for(int j=0;j<grid[0].length;j++) {
				if(grid[i][j]==2 ) {
					q.add(new int[]{i,j});
					System.out.println("adding rotten orange to queue at i="+i+" and j="+j);
					visited[i][j]=true;
				}
			}
		}
		int count=0;
		
		while(!q.isEmpty()) {
			int s= q.size();
			Boolean rotten =false;
			
			for(int z=0;z<s;z++) {
				int[]item= q.poll();
				int dx= item[0];
				int dy= item[1];
				
				for(int i=0;i<x.length;i++) {
					int nx= x[i]+dx;
					int ny=y[i]+dy;
					
					if(nx>=0 && nx<grid.length && ny>=0 && ny<grid[0].length) {
						if(!visited[nx][ny] && grid[nx][ny]==1) {
							System.out.println("rotting the fresh orange at i="+nx+" and j="+ny);
							q.add(new int[] {nx,ny});
							visited[nx][ny]=true;
							rotten= true;
							grid[nx][ny]=2;
						}
					}
				}
			}
			
			if(rotten) {
				count=count+1;
			}
			
		}
		
		for(int i=0;i<grid.length;i++) {
			for(int j=0;j<grid[0].length;j++) {
				if(grid[i][j]==1) {
					System.out.println("all fresh oranges cannot be rotten");
					return;
				}
			}
		}
		System.out.println("time taken to rot all oranges "+count+" minutes");
		
	}

}
