package Divide_and_Conquer;

public class Book_Allocation {
	
	public static boolean ispossible(int[]books, int student, int maxall) {
		int s=1;
		int all=0;
			for(int i=0;i<books.length;) {
				if(all+books[i]<=maxall) {
					all+=books[i];
					i++;
				}else {
					s++;
					all=0;
				}
				if(s>student) {
					return false;
				}
			}
		
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] books= {12, 34, 67, 90};
		int student= 2;
		
		int ans=0;
		int low=0;
		int high=0;
		for(int i=0;i<books.length;i++) {
			high+=books[i];
		}
		
		while(high>=low) {
			int mid=(low+high)/2;
			
			if(ispossible(books,student,mid)) {
				ans= mid;
				high=mid-1;
			}else {
				low=mid+1;
			}
		}
		
		System.out.println(ans);

	}

}
