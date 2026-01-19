package Recursion2;

public class r28_count_prime {
	public static void prime(int n, boolean[]arr) {
		arr[0]=true;
		arr[1]=true;
		
		for(int i=2;i*i<n;i++) {
			if(arr[i]==false) {
				for(int j=2;i*j<n;j++) {
					arr[i*j]=true;
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=100;
		boolean[]arr= new boolean[n+1];
//		by default all index will be false- prime;
//		so true index- not prime
		prime(n,arr);
		int count=0;
		
		for(int i=2;i<=n;i++) {
			if(arr[i]==false) {
				System.out.println(i);
				count++;
			}
		}
		System.out.println("count="+count);
	}

}
