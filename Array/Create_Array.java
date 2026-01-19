package Array;

import java.util.Scanner;

public class Create_Array { // function, loop and user input
	
	
	public static int[] loop(int size) {
		
		int []arr= new int [size];
		int val=1; //for the value at each index in increasing order 
		for(int i=0; i<size;i++) {
			arr[i]=val;
			val++;
		}
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s= new Scanner(System.in);
		int size= s.nextInt();
		int []arr= loop(size);
		
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}
	}

}
