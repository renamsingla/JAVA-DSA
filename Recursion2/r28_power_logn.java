package Recursion2;

public class r28_power_logn {
	public static int pow(int a, int n) {
		if(n==0) {
			return 1;
		}
		int ans=pow(a,n/2);
		ans=ans*ans;
		if(n%2!=0) {
			ans*=a;
			return ans;
		}
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=2;
		int n=6;
		int ans=pow(a,n);
		System.out.println(ans);

	}

}
