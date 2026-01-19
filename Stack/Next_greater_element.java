package Stack;

import java.util.Scanner;
import java.util.Stack;

public class Next_greater_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		Stack<Integer> st= new Stack<>();
        int n= s.nextInt();
        int[]arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }

        int[]newarr= new int[n];
        
        st.push(0);
        for(int i=1;i<n;i++) {
        	while(!st.isEmpty() && arr[i]>arr[st.peek()]) {
        		newarr[st.pop()]=arr[i];
        	}
        	st.push(i);
        }
        
        while(!st.isEmpty()) {
        	newarr[st.pop()]=-1;
        }
        
        for(int i=0;i<n;i++) {
        	System.out.print(newarr[i]+" ");
        }


	}

}
