package DP;

public class Wine_Problem {
	
	public static int maxBU(int[]arr) {
		int[][]dp= new int[arr.length][arr.length];
		for(int i=0;i<arr.length;i++) {
			dp[i][i]=arr.length*arr[i];
		}
		int year=arr.length-1;
		
		for(int d=1;d<arr.length;d++) {
			for(int j=d;j<arr.length;j++) {
				int i=j-d;
				int left= arr[i]*year +dp[i+1][j];
				int right= arr[j]*year +dp[i][j-1];
				dp[i][j]= Math.max(left,right);
			}
			year--;
		}
		return dp[0][arr.length-1];
	}
	
	public static int max(int[]arr, int i, int j , int year, int[][]dp) {
		if(i>j) {
			return 0;
		}
		if(dp[i][j]!=0) {
			return dp[i][j];
		}
		int left= arr[i]*year+ max(arr, i+1, j,year+1,dp);
		int right= arr[j]*year+ max(arr, i, j-1,year+1,dp);
		return dp[i][j]= Math.max(left, right);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {2,3,5,1,4};
		int[][]dp= new int[arr.length][arr.length];
		System.out.println(max(arr,0,arr.length-1,1,dp));
		System.out.println(maxBU(arr));
	}

}
