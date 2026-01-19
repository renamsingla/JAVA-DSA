package Recursion;

public class coin_combination {
	public static void coinpermutation(int[]arr, int target,String str,int sum,int j) {
		if(target==sum) {
			System.out.println(str);
			return;
		}
		if(sum>target) {
			return;
		}
		for(int i=j;i<arr.length;i++) {
			coinpermutation(arr,target,str+arr[i],sum+arr[i],i);
			//we are passing 'i' as an argument and not i+1 because we have unlimited coins of specific
			// amount and we don't have to move to next just because we have used it once
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {2,5,3};
		int target=8;
		int sum=0;
		int j=0;
		coinpermutation(arr,target,"",sum,j);
		

	}

}
