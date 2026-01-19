package pattern;

public class P11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int nst=1;
		int nsp=4;
		
		int row=1;
		while(row<=n) {
			
			for(int i=1;i<=nsp;i++) {
				System.out.print(" "+" ");
			}
			
			for(int i=1;i<=nst;i++) {
				if(i%2==0) {
					System.out.print(" "+" ");
				}else {
					System.out.print("*"+" ");
				}
			}
			
			nsp--;
			nst+=2;
			row++;
			System.out.println();
		}

	}

}
