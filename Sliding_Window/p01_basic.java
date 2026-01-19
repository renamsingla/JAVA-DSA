package Sliding_Window;

public class p01_basic {
	
	public static int slidingWindow(int[]arr, int k) {
		int i=0;
		int j= k-1;
		int sum=0;
		int maxsum=0;
		while(j<arr.length) {
			for(int m=i;m<=j;m++) {
				sum+=arr[m];
			}
			maxsum=Math.max(sum, maxsum);
			sum=0;
			i++;
			j++;
		}
		
		return maxsum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {2,1,3,4,7,2,6,4,5};
		int k=3;
		
		System.out.println(slidingWindow(arr,k));
		
		

	}

}
