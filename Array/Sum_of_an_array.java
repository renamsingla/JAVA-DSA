package Array;

import java.util.Scanner;

public class Sum_of_an_array {
	
	public static void RunningSun(int[]arr) {
		for(int i=1; i<arr.length;i++) {
			//prefix technique
			arr[i]= arr[i-1]+arr[i];
		}
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static int SumofArray(int[]arr) {
		
		int n= arr.length;
		int sum=0;
		for(int i=0;i<n;i++) {
			sum= sum +arr[i];
		}
		
		return sum;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s= new Scanner( System.in);
		int n = s.nextInt();
		
		int[]arr= new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=s.nextInt();
		}
		int sum= SumofArray(arr);
		System.out.println(sum);
		
		RunningSun(arr);
		

	}

}
