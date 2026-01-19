package pattern;

public class P3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int nst=5;
		int row=1;
		while(row<=n) {
			for(int i=1;i<=nst;i++) {
				System.out.print("*"+" ");
			}
			row++;
			nst--;
			System.out.println();
		}

	}

}
