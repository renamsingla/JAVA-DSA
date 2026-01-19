package Array;

import java.util.Scanner;

public class Reverse_Array {
	
	public static void SameArray(int[]arr) {
		// make changes in heap memory
		int i=0;
		int j= arr.length-1;
		while(i<=j) {
			int temp= arr[i];
			arr[i]= arr[j];
			arr[j]= temp;
			i++;
			j--;
		}
		for(int k=0;k<arr.length;k++) {
			System.out.print(arr[k]+ " ");
		}
		System.out.println();
	}
	
	public static void NewArray(int[]arr) {
		int[]brr= new int [arr.length];
		int j= arr.length-1;
		for(int i=0; i<arr.length;i++) {
			brr[i]= arr[j];
			j--;
		}
		for(int k=0; k<arr.length;k++) {
			System.out.print(brr[k]+ " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s= new Scanner(System.in);
		int n =s.nextInt();
		int[]arr= new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=s.nextInt();
		}
		NewArray(arr);
		SameArray(arr);
	}

}
