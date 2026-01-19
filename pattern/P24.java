package pattern;

public class P24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=5;
		int nsp=4;
		int num=1;
		
		int row=1;
		while(row<=n) {
			for(int i=1;i<=nsp;i++) {
				System.out.print(" "+" ");
			}
			for(int i=1;i<=num;i++) {
				System.out.print(row+" ");
			}
			
			nsp--;
			num+=2;
			row++;
			System.out.println();
		}

	}

}
