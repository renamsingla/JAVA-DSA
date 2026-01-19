package Recursion2;

public class r26_queen_chessboard {
	public static void display(boolean[][]board) {
		for(int i=0;i<board.length;i++) {
			for(int j=0;j<board[0].length;j++) {
				System.out.print(board[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
	}
	public static boolean IsItPossible(int r, int c,boolean[][]board) {
//		direct upwards
		for(int row=r;row>=0;row--) {
			if(board[row][c]) return false;
		}
//		left diagonal
		int row=r;
		int col=c;
		while(row>=0 && col>=0) {
			if(board[row][col]) return false;
			row--;
			col--;
		}
//		right diagonal
		row=r;
		col=c;
		while(row>=0 && col<board[0].length) {
			if(board[row][col]) return false;
			row--;
			col++;
		}
		
		return true;
	}
	public static void chessboard(int n, boolean[][]board, int queen, int r) {
		if(queen==n) {
			display(board);
			return;
		}
		if(r>=n) {
			return;
		}
		
			for(int j=0;j<n;j++) {
				if(IsItPossible(r,j,board)) {
					board[r][j]=true;
					chessboard(n,board,queen+1,r+1);
					board[r][j]=false;
				}
			}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		boolean[][]board= new boolean[n][n];
		
		chessboard(n,board,0,0);

	}

}
