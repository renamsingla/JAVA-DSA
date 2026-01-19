package Divide_and_Conquer;

public class MergeSort {
	
	public static int[] mergesort(int[]arr, int i, int j) {
		
		if(i==j) {
			int[]nums= new int[1];
			nums[0]=arr[i];
			return nums;
		}
		int mid= (i+j)/2;
		int []fa= mergesort(arr,i,mid);
		int[]sa= mergesort(arr,mid+1,j);
		
		int[]newarr= merge(fa,sa);
		return newarr;
	}
	
	public static int[] merge(int[]fa, int[]sa) {
		int n= fa.length;
		int m= sa.length;
		
		int[]newarr=new int [n+m];
		
		int i=0;
		int j=0;
		int k=0;
		
		while(i<n && j<m) {
			if(fa[i]<=sa[j]) {
				newarr[k]=fa[i];
				k++;
				i++;
			}else {
				newarr[k]=sa[j];
				k++;
				j++;
			}
		}
		while(i<n) {
			newarr[k]=fa[i];
			k++;
			i++;
		}
		while(j<m) {
			newarr[k]=sa[j];
			k++;
			j++;
		}
		return newarr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {7,5,1,4,3};
		int [] brr= mergesort(arr,0,arr.length-1);
		for(int i=0;i<brr.length;i++) {
			System.out.print(brr[i]+" ");
		}
	

	}

}
