package Recursion2;

public class p2_factorial {
	public static int recursion(int n) {
		
		if(n==1) {
			return 1;
		}
		
		int chotaans= recursion(n-1);
		int meraans= chotaans*n;
		return meraans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int ans=recursion(n);
		System.out.println(ans);

	}

}
