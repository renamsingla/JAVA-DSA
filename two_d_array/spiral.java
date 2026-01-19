package two_d_array;

public class spiral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][]arr= {{1,2,3,4},
				{5,6,7,8},
				{9,1,2,3},
				{4,5,6,7}};
		int m=arr.length;
		int n= arr[0].length;
		int minrow=0;
		int maxrow=arr.length-1;
		int mincol=0;
		int maxcol=arr[0].length-1;
		int count=0;
		
		while(count<m*n) {
		for(int i=mincol;i<=maxcol;i++) {
			System.out.print(arr[minrow][i]+" ");
			count++;
		}
		minrow++;
		
		for(int i=minrow;i<=maxrow;i++) {
			System.out.print(arr[i][maxcol]+" ");
			count++;
		}
		maxcol--;
		
		for(int i=maxcol;i>=mincol;i--) {
			System.out.print(arr[maxrow][i]+" ");
			count++;
		}
		maxrow--;
		
		for(int i=maxrow;i>=minrow;i--) {
			System.out.print(arr[i][mincol]+" ");
			count++;
		}
		mincol++;
		}

	}

}
