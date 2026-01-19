package Stack;

import java.util.Scanner;
import java.util.Stack;

public class Stock_span {
	public static void empty(Stack<Integer>st){
		while(!st.isEmpty()){
			st.pop();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		Stack<Integer>st= new Stack<>();
		int n=s.nextInt();
		int[]arr= new int[n];
		for(int i=0;i<n;i++){
			arr[i]=s.nextInt();
		}	
		int[]newarr= new int[n];

		for(int i=0;i<n;i++){
			if(!st.isEmpty() && arr[i]<st.peek()){
				empty(st);
			}
			st.push(arr[i]);
			newarr[i]=st.size();
		}

		for(int i=0;i<n;i++){
			System.out.print(newarr[i]+" ");
		}
		System.out.print("END");

	}

}
