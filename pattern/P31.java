package pattern;

public class P31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=5;
		
		int row=1;
		while(row<=n) {
			int k=5;
			for(int i=1;i<=n;i++) {
				System.out.print(k+" ");
				k--;
			}
			
			row++;
			System.out.println();
		}

	}

}
