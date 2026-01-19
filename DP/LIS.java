package DP;

public class LIS {
	
	public static int BinarySearch(int[]dp, int i, int j, int item) {
		int idx=-1;
		while(j>=i) {
			int mid= (i+j)/2;
			if(dp[mid]>=item) {
				idx=mid;
				j=mid-1;
			}else {
				i= mid+1;
			}
		}
		return idx;
	}
	
	public static int lis(int[]arr) {
		int[]dp= new int[arr.length];
		dp[0]=arr[0];
		
		int len=1; //maintaining length of the list
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>dp[len-1]) {
				dp[len]=arr[i];
				len++;
			}else {
				int idx= BinarySearch(dp,0,len-1,arr[i]);
				dp[idx]=arr[i];
			}
		}
		return len;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 0, 8, 4, 2, 12, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15 };
		int len=lis(arr);
		System.out.println(len);

	}

}
