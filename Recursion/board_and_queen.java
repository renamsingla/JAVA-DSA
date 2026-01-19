package Recursion;

public class board_and_queen {
	public static void arrangement( int q, boolean[]board, String str, int qs) {
		
		if(qs==q) {
			System.out.println(str);
			return;
		}
		
		for(int i=0;i<board.length;i++) {
			if(board[i]==false) {
				board[i]=true;
				arrangement(q,board,str+'b'+i+'q'+qs+" ",qs+1);
				board[i]=false;// UNDO THE BOOLEAN -> BACKTRACKING
				
			}
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		boolean[]board= new boolean[n];
		int q=2;
		int qs=0;
		
		arrangement(q,board,"",0);

	}

}
