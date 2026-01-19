package Recursion2;

public class r09_FirstOccuranceInArray {
	
	public static int CallingArray(int[]arr, int i) {
		
		if(i==arr.length) {
			return -1;
		}
		if(arr[i]==0) {
			return i;
			
		}
		return CallingArray(arr,i+1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {1,2,3,1,0,0,1,0,2,0,1};
		int ans=CallingArray(arr,0);
		
		System.out.println(ans);
		

	}

}
