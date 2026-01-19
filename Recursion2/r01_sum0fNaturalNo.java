package Recursion2;

public class r01_sum0fNaturalNo {
	public static int recursion(int n) {
		
		if(n==0) {
			return 0;
		}
		
		int sum=recursion(n-1);
		int ans= sum+n;
		
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int ans= recursion(n);
		System.out.println(ans);
	}

}
