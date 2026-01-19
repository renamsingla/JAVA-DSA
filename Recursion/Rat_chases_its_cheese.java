package Recursion;

import java.util.Scanner;

public class Rat_chases_its_cheese {
	
	static boolean val= false;
	
	public static void display(int[][]maze) {
		for(int i=0;i<maze.length;i++) {
			for(int j=0;j<maze[0].length;j++) {
				System.out.print(maze[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void ratchase(char[][]arr, int[][]maze,int cc, int cr){

        if(cc<0 || cr<0 || cc>=arr[0].length || cr>=arr.length || arr[cr][cc]=='X'){
            return;
        }
        if(cr==arr.length-1 && cc==arr[0].length-1) {
			maze[cr][cc]=1;
			val=true;
			display(maze);
		}
       
        maze[cr][cc]=1;
        arr[cr][cc]='X';
    
        ratchase(arr,maze,cc,cr-1);
        ratchase(arr,maze,cc,cr+1);
        ratchase(arr,maze,cc+1,cr);
        ratchase(arr,maze,cc-1,cr);
        arr[cr][cc]='O';
        maze[cr][cc]=0;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner (System.in);
		int n= s.nextInt();
		int m= s.nextInt();
		char[][]arr= new char[n][m];
		for(int i=0;i<n;i++){
			String str= s.next();
			for(int j=0;j<str.length();j++){
				arr[i][j]= str.charAt(j);
			}
		}
		int[][]maze=new int[n][m];
		ratchase(arr, maze, 0,0);
       // display(maze);
		if(val==false) {
			System.out.println("NO PATH FOUND");
		}

	}

}
