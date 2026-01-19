package Divide_and_Conquer;

public class Sort_last_index {
	
	public static void partition(int[]arr, int i,int j) {
		int indx= i;
		int item= arr[j];
		for(int k=i;k<j;k++) {
			if(arr[k]<item) {
				int temp= arr[k];
				arr[k]= arr[indx];
				arr[indx]=temp;
				indx++;
			}
		}
		int temp= arr[indx];
		arr[indx]=arr[j];
		arr[j]=temp;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {5,7,2,3,8,1,4};
		
//		MY LOGIC USING TWO POINTER- ONE SLOW ANOTHER FAST
//		int i=0;
//		int j=1;
//		while(j<arr.length) {
//			if(arr[i]<arr[j]) {
//				j++;
//			}else {
//				int temp= arr[i];
//				arr[i]=arr[j];
//				arr[j]= temp;
//				i++;
//				j++;
//			}
//		}
		
//		SIR LOGIC 
		partition(arr, 0, arr.length-1);
		
		for(int k=0;k<arr.length;k++) {
			System.out.print(arr[k]+" ");
		}

	}

}
