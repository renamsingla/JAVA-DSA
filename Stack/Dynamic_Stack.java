package Stack;

public class Dynamic_Stack extends stack{
	
	public void push(int item) throws Exception {
		if(isFull()) {
			int[]brr= new int[2*arr.length];
			for(int i=0;i<arr.length;i++) {
				brr[i]=arr[i];
			}
			arr=brr;
		}
		super.push(item);
	}

	

}
