package Stack;

import java.util.Scanner;
import java.util.Stack;

public class Kartik_Bhaiya_and_Celebrity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		Stack<Integer>st=new Stack<>();
		int n=s.nextInt();

		int[][]arr=new int[n][n];
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				arr[i][j]=s.nextInt();
			}
		}
		for(int i=0;i<n;i++){
			st.push(i);
		}

		while(st.size()>1){
			int a= st.pop();
			int b=st.pop();
			if(arr[a][b]==1){
				st.push(b);
			}else{
				st.push(a);
			}
		}
		int item=st.pop();
		for(int i=0;i<n;i++){
			if(i==item){
				continue;
			}
			if(arr[item][i]==1){
				System.out.println("No Celebrity");
				return;
			}
		}
		System.out.println(item);
		


	}

}
