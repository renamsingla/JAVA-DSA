package two_d_array;

import java.util.Scanner;

public class transpose {
	public static void display(int[][]arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	public static void transpose(int[][]arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<i;j++) {
				int temp=arr[i][j];
				arr[i][j]=arr[j][i];
				arr[j][i]=temp;
			}
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int[][]arr= {{1,2,3,4},
				{5,6,7,8},
				{9,1,2,3},
				{4,5,6,7}};
		transpose(arr);
		display(arr);

	}

}
