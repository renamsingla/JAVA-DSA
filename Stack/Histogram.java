package Stack;

import java.util.Stack;

public class Histogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer>st= new Stack<>();
		int maxarea=0;
		int area=0;
		int[]arr= {2,1,5,6,2,3};
		
		for(int i=0;i<arr.length;i++) {
			
			while(!st.isEmpty() && arr[i]<arr[st.peek()]) {
				int h= arr[st.pop()];
				if(st.isEmpty()) {
					area=h*i;
				}else {
					area= h*(i-st.peek()-1);
				}
			}
			st.push(i);
			maxarea= Math.max(maxarea, area);
		}
			
			int r=arr.length;
			while(!st.isEmpty()) {
				int h=arr[st.pop()];
				if(st.isEmpty()) {
					area=h*r;
				}else {
					area=h*(r-st.peek()-1);
				}
				maxarea= Math.max(maxarea, area);
			}
			
			System.out.println(maxarea);
			
		
		

	}

}
