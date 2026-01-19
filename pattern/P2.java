package pattern;

public class P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int row=1;
		
		while(row<=n) {
			int i=1;
			while(i<=row) {
				System.out.print("*"+" ");
				i++;
			}
			row++;
			System.out.println();
		}

	}

}
