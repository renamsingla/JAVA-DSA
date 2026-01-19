package pattern;

public class P30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int num=5;
		int j=5;
		
		
		int row=1;
		while(row<=n) {
			int k=5;
			for(int i=1;i<=num;i++) {
				if(i==j) {
					System.out.print("*"+" ");
					k--;
				}else {
					System.out.print(k+" ");
					k--;
				}
			}
			j--;
			row++;
			System.out.println();
		}

	}

}
