package Recursion2;

public class r14_Tower_of_Hanoi {
	
	public static void toh (int n, String src, String hlp, String des ) {
		if(n==0) {
			return;
		}
		toh(n-1,src,des,hlp );
		System.out.println("move "+ n+"th disk from "+ src+" to "+des);
		toh(n-1,hlp,src,des);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		toh(3,"A","C","B");

	}

}
