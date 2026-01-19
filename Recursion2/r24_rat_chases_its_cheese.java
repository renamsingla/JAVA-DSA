package Recursion2;

import java.util.Scanner;

public class r24_rat_chases_its_cheese {
	public static void display (int[][]maze) {
		for(int i=0;i<maze.length;i++) {
			for(int j=0;j<maze[0].length;j++) {
				System.out.print(maze[i][j]);
			}
			System.out.println();
		}
	}
	
	public static void chase(char [][]grid,int[][]maze, int i,int j ) {
		if(i==grid.length-1 && j==grid[0].length-1) {
			if(grid[i][j]=='X') {
				System.out.println("NO PATH FOUND");
//				THIS NEEDS TO BE WRITTEN IN MAIN METHOD, WHAT IF THE FIRST CELL IS BLOCKED
			}else {
				maze[i][j]=1;
				display(maze);
			}
		}
		if(i<0 || j<0 || i>=grid.length || j>=grid[0].length) {
			return;
		}
		if(grid[i][j]=='X') {
			return;
		}
		
		grid[i][j]='X';
		maze[i][j]=1;
		chase(grid,maze,i-1,j);
		chase(grid,maze,i,j-1);
		chase(grid,maze,i+1,j);
		chase(grid,maze,i,j+1);
		maze[i][j]=0;
		grid[i][j]='O';
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		int m= s.nextInt();
		char [][]grid= new char[n][m];
		for(int i=0;i<n;i++) {
			String st= s.next();
			for(int j=0;j<m;j++) {
				grid[i][j]=st.charAt(j);
			}
		}
		
		int[][]maze= new int[n][m];
		chase(grid,maze,0,0);

	}

}
