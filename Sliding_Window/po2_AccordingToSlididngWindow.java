package Sliding_Window;

public class po2_AccordingToSlididngWindow{
	
	public static int slidingwindow(int[]arr, int k) {
		int sum=0;
		int maxsum=0;
		
		for(int i=0;i<k;i++) {
			sum+=arr[i];
			maxsum=sum;
		}
		
		for(int i=k;i<arr.length;i++) {
			sum+=arr[i];
			sum-=arr[i-k];
			maxsum=Math.max(maxsum, sum);
		}
		return maxsum;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {2,1,3,4,7,2,6,4,5};
		int k=3;
		
		System.out.println(slidingwindow(arr,k));

	}

}
