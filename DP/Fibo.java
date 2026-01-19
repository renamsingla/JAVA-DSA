package DP;

public class Fibo {
	
	public static int fibo1(int n) {
		if(n==0 || n==1) {
			return n;
		}
		
		int f1= fibo1(n-1);
		int f2= fibo1(n-2);
		return f1+f2;
	}
	
	public static int fibo2(int n, int[]arr) {
		
		if(n==0 || n==1) {
			return n;
		}
		if(arr[n]!=0) { //dp applied
			return arr[n];
		}
		int f1= fibo2(n-1, arr);
		int f2= fibo2(n-2, arr);
		arr[n]=f1+f2; //memo
		return f1+f2;
	}
	
	public static int fibo3(int n) {
		int[]dp= new int[n+1];
		dp[0]=0;
		dp[1]=1;
		
		for(int i=2;i<dp.length;i++) {
			dp[i]=dp[i-1]+dp[i-2];
		}
		return dp[n];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n= 6;
		int[]arr= new int[n+1];
		int ans1=fibo1(n);  //recursion
		int ans2=fibo2(n,arr); //top down
		int ans3=fibo3(n);  //bottom up
		System.out.println(ans3);

	}

}
