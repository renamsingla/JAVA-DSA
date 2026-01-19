package Recursion;

public class travel_to_corner {
	public static void travel(int[][]arr, int m, int n,int h, int v, String str) {
		if(h>=m || v>=n) {
			return;
		}
		if(h==m-1 && v==n-1) {
			System.out.println(str);
		}
		
		travel(arr, m,n,h+1,v,str+"h");
		travel(arr,m,n,h,v+1, str+"v");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m=3;
		int n=3;
		int[][]arr= new int[m][n];
		travel(arr,m,n,0,0,"");
		

	}

}
