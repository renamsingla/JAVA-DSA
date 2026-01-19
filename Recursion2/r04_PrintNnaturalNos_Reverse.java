package Recursion2;

public class r04_PrintNnaturalNos_Reverse {
	
	public static void PrintNaturalNoReverse(int n) {
		
		if(n==0) {
			return;
		}
		
		System.out.print(n+" ");
		PrintNaturalNoReverse(n-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		PrintNaturalNoReverse(n);

	}

}
