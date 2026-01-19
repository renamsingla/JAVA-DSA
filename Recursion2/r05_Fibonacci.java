package Recursion2;

public class r05_Fibonacci {
	
	public static int fibonacci(int n) {
		
		if(n==1) {
			return 1;
		}
		if(n==0) {
			return 0;
		}
		int fibo1= fibonacci(n-1);
		int fibo2= fibonacci(n-2);
		int ans= fibo1+fibo2;
		
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=6;
		System.out.println(fibonacci(n));

	}

}
