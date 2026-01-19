package Recursion;

public class fibonacci {
	public static int fibbo(int n) {
		if(n==0) {
			return 0;
		}
		if (n==1) {
			return 1;
		}
		int ans1=fibbo(n-1);
		int ans2=fibbo(n-2);
		int ans= ans1+ans2;
		return ans;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=7;
		System.out.println(fibbo(n));

	}

}
