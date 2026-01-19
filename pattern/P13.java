package pattern;

public class P13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		
		int nst=1;
		int row=1;
		while(row<=9) {
			for(int i=1;i<=nst;i++) {
				System.out.print("*"+" ");
			}
			if(row<n) {
				nst++;
				row++;
			}else {
				nst--;
				row++;
			}
			System.out.println();
			
		}

	}

}
