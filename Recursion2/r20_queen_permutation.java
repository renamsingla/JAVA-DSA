package Recursion2;

public class r20_queen_permutation {
	public static void permutation(boolean[]board, int k, String ans) {
		if(k==0) {
			System.out.println(ans);
			return;
		}
		
		for(int i=0;i<board.length;i++) {
			if(board[i]==false) {
				board[i]=true;
				permutation(board,k-1,ans+"b"+i+"q"+k);
			}
			board[i]=false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		int k=2;
		boolean[]board=new boolean[n];
		
		permutation(board, k, "");
		

	}

}
