package Sliding_Window;

import java.util.Scanner;

public class monu_bhaiya_and_score {
	 public static int subarray(int[]arr, int k){
	        int sum=0;
	        int len=0;
	        int i=0;
	        int j=0;
	        int count=0;
	        while(j<arr.length){
	            sum+=arr[j];
	            len=(j-i)+1;
	            int product=sum*len;
	            if(product<k){
	            	System.out.println(product);
	                count+=len;
	                j++;
	            }else{
	                sum-=arr[i];
	                sum-=arr[j];
	                i++;
	            }
	        }
	        return count;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[]arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int k=s.nextInt();

        int output= subarray(arr,k);
        System.out.println(output);
	}

}
