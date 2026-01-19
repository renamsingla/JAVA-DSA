package Strings;

public class Finding_cb_no {
	public static boolean IsCBno(long num) {
		if(num==1 || num==0) {
			return false;
		}
		int[]arr= {2,3,5,7,11,13,17,19,23,29};
		for(int i=0;i<arr.length;i++) {
			if(num==arr[i]) {
				return true;
			}
			if(num%arr[i]==0) {
				return false;
			}
		}
		
		return true;
	}
	public static int substring(String s) {
		int count=0;
		boolean[]visited= new boolean[s.length()];
		for(int len=1;len<=s.length();len++) {
			for(int j=len;j<=s.length();j++) {
				int i=j-len;
				String str=s.substring(i,j);
//				string to number-
				long l=Long.parseLong(str);
				if(IsCBno(l)==true && Isvisited(visited,i,j)==true) {
					count++;
					for(int k=i;k<j;k++) {
						visited[k]=true;
					}
				}
			}
		}
		return count;
	}
	public static boolean Isvisited(boolean[]visited, int i, int j) {
		for(int k=i;k<j;k++) {
			if(visited[k]) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="127";
		
		System.out.println(substring(s));
		
		
	}

}
