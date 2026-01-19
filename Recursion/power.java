package Recursion;

public class power {
	public static int power(int a, int b) {
		if(b==0) {
			return 1;
		}
		int ans=power(a,b-1);
		ans=a*ans;
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=3;
		int b=3;
		System.out.println(power(a,b));
	}

}
