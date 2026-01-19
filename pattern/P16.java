package pattern;

public class P16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int nst=5;
		int nsp=4;
		
		int row=1;
		while(row<=9) {
			
			for(int i=1;i<=nsp;i++) {
				System.out.print(" "+" ");
			}
			
			for(int i=1;i<=nst;i++) {
				System.out.print("*"+" ");
			}
			
			if(row<n) {
				nsp-=1;
				nst--;
			}else {
				nsp++;
				nst++;
			}
			row++;
			System.out.println();
		}

	}

}
