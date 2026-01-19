package Recursion2;

public class r21_quuen_combination {
	public static void combination(boolean[]board, int k, String ans, int index) {
		if(k==0) {
			System.out.println(ans);
			return;
		}
		
		for(int i=index;i<board.length;i++) {
			if(board[i]==false) {
				board[i]=true;
				combination(board,k-1,ans+"b"+i+"q"+k, i+1);
			}
			board[i]=false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		int k=2;
		boolean[]board=new boolean[n];
		
		combination(board, k, "",0);

	}

}
