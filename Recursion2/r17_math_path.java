package Recursion2;

public class r17_math_path {

	public static void path(String ans, int i, int j, int[][]arr) {
		if(i==arr.length-1 && j==arr[0].length-1) {
			System.out.println(ans);
			return;
		}
		if(i==arr.length) {
			return;
		}
		if(j==arr[0].length) {
			return;
		}
		path(ans+"V",i+1,j,arr);
		path(ans+"H",i,j+1,arr);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m=3;
		int n=3;
		
		int[][]arr= new int[m][n];
		path("",0,0,arr);
		

	}

}
