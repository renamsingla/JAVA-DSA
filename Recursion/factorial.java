package Recursion;

public class factorial {
	public static int factorialtail(int n, int ans ){
		
		if(n==0) {
			return ans;
		}
		
		ans*=n;
		return factorialtail(n-1, ans);
		
	}
	public static int factorial(int n) {
		
		
		if(n<1) {
			return 1 ;
		}
		int ans= factorial(n-1);
		ans=ans*n;
		
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		//System.out.print(factorial(n));
		System.out.print(factorialtail(n,1));

	}

}
