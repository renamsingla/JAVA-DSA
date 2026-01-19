package Recursion;

public class coin_permutation {
	public static void coinpermutation(int[]arr, int target,String str,int sum) {
		if(target==sum) {
			System.out.println(str);
			return;
		}
		if(sum>target) {
			return;
		}
		for(int i=0;i<arr.length;i++) {
			coinpermutation(arr,target,str+arr[i],sum+arr[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {2,5,3};
		int target=8;
		int sum=0;
		coinpermutation(arr,target,"",sum);
		

	}

}
