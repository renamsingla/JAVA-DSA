package pattern;

public class P22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=5;
		int nst=4;
		int nsp=1;
		
		int row=1;
		while(row<=n) {
			if(row==1) {
				for(int i=1;i<=9;i++) {
					System.out.print("*"+" ");
				}
			}else {
				for(int i=1;i<=nst;i++) {
					System.out.print("*"+" ");
				}
				for(int i=1;i<=nsp;i++) {
					System.out.print(" "+" ");
				}
				for(int i=1;i<=nst;i++) {
					System.out.print("*"+" ");
				}
				
			}
			if(row!=1) {
				nst--;
				nsp+=2;
			}
			row++;
			System.out.println();
		}

	}

}
