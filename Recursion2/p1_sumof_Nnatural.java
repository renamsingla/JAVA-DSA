package Recursion2;

public class p1_sumof_Nnatural {
	public static int recursion(int n) {
	
		if(n==0) {
			return 0;
		}
		int chotaans=recursion(n-1);
		int meraans= chotaans+n;
		return meraans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int sum=recursion(n);
		System.out.println(sum);
	}

}
