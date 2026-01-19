package Array;

import java.util.Scanner;

public class Min_Max_Retrun_Array {
	
	public static int[] ReturnArray(int[]arr, int min, int max) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum= sum+arr[i];
		}
		int[]brr= new int[3];
		brr[0]= min;
		brr[1]= max;
		brr[2]= sum;
		
		return brr;
	}
	
	public static int MaxofArray(int[]arr) {
		int max=arr[0];
		int i=1;
		while(i<arr.length) {
			if(arr[i]>max) {
				max=arr[i];
			}
			i++;	
		}
		return max;
	}
	
	public static int MinofArray(int[]arr) {
		int i=1;
		int min= arr[0];
		while(i<arr.length) {
			if(arr[i]<min) {
				min= arr[i];
			}
			i++;
		}
		
		return min;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n= s.nextInt();
		int[]arr= new int[n];
		for(int i=0; i<n; i++) {
			arr[i]= s.nextInt();
		}
		int min= MinofArray(arr);
		
		int max= MaxofArray(arr);
		
		int[]brr= ReturnArray(arr, min, max);
		//for each loop
		for(int val: brr) {
			System.out.print(val+" ");
		}
	}

}
