package Recursion;

public class Print_nreverseno {
	public static void printreverse(int n) {
		if(n==0) {
			return ;
		}
		System.out.print(n+" ");
		print(n-1);
		
	}
	public static void print(int n) {
		if(n==0) {
			return ;
		}
		print(n-1);
		System.out.print(n+" ");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		print(n);
		System.out.println();
		printreverse(n);

	}

}
