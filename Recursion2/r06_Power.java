package Recursion2;

public class r06_Power {
	
	public static int power(int a, int b) {
		
		if(b==0) {
			return 1;
		}
		int p= power(a, b+1);
		int ans= p*a;
		
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=3;
		int b=-5;
		int ans=power(a,b);
		System.out.println(ans);

	}

}
