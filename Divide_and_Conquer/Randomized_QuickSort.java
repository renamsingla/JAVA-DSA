package Divide_and_Conquer;

import java.util.Random;

public class Randomized_QuickSort {
	public static int partition(int[]arr, int i, int j) {
		Random rn= new Random();
		int p= rn.nextInt(j-i+1)+i;
		int temp2= arr[p];
		arr[p]=arr[j];
		arr[j]=temp2;
		int indx=i;
		for(int k=i;k<j;k++) {
			if(arr[k]<arr[j]) {
				int temp= arr[k];
				arr[k]=arr[indx];
				arr[indx]= temp;
				indx++;
			}
		}
		int temp= arr[j];
		arr[j]=arr[indx];
		arr[indx]=temp;
		
		return indx;
	}
	
	public static void quick(int[]arr,int i, int j) {
		if(i>=j) {
			return;
		}
		int idx= partition(arr,i,j);
		quick(arr,i,idx-1);
		quick(arr, idx+1,j);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {5,7,2,3,8,1,4};
		
		quick (arr,0,arr.length-1);
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
