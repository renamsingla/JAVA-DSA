package Recursion2;

import java.util.Scanner;

public class r25_Word_search {
	
	public static boolean search(char[][]board, String word, int i, int j, int index) {
		if(word.length()==index) {
			return true;
		}
		if(i<0 || j<0 || i>=board.length || j>=board[0].length || board[i][j]!=word.charAt(index)) {
			return false;
		}
		board[i][j]='*';
		int[]r= {-1,0,0,1};
		int[]c= {0,-1,1,0};
		for(int k=1;k<=4;k++) {
			boolean ans=search(board,word,i+r[k],j+c[k],index+1);
			if(ans==true) {
				return true;
			}
			
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		
		String word= "ABCCED";
		
		char[][]board=new char[3][4];
		for(int i=0;i<3;i++) {
			String st= s.next();
			for(int j=0;j<4;j++) {
				board[i][j]=st.charAt(j);
			}
		}
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<4;j++) {
				if(board[i][j]==word.charAt(0)) {
					boolean ans=search(board,word,i,j, 0);
					if(ans==true) {
						System.out.print(ans);
						return;
					}
				}
			}
		}
		System.out.print(false);
		

	}

}
