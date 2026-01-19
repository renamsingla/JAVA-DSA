package Recursion;

public class check_three {
	public static int check(int[]arr, int i, int n) {
		if(i==arr.length) {
			return -1;
		}
		if(arr[i]==n) {
		   int ans=i;
		   return ans;
			
		}
		return check(arr,i+1, n);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {2,0,5,3,7,3};
		int n=3;
		System.out.print(check(arr,0,n));

	}

}
