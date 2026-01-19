package OOP;

public class Genrics_demo {
	
//	this is a generic method 
	public static <T> void Display(T[]arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[]arr= {"abc", "def", "ghi","jkl"};
		Integer[]brr= {1,2,3,4,5,6,7};
		Display(arr);
		Display(brr);
	}

}
