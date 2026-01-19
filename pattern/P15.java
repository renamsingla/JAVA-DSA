package pattern;

public class P15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int nst=5;
		int nsp=0;
		
		int row=1;
		while(row<=9) {
			
			for(int i=1;i<=nsp;i++) {
				System.out.print(" "+" ");
			}
			
			for(int i=1;i<=nst;i++) {
				System.out.print("*"+" ");
			}
			
			if(row<n) {
				nsp+=2;
				nst--;
			}else {
				nst++;
				nsp-=2;
			}
			row++;
			System.out.println();
		}

	}

}
