package DP;

import java.util.Arrays;
import java.util.Scanner;

public class Edit_distance {
	public static int editTD(String s, String t, int i, int j, int[][]dp) {
		if(i==s.length() && j==t.length()) {
			return 0;
		}
		if(i==s.length() && j!=t.length()) {
			return t.length();
		}
		if(i!=s.length() && j==t.length()) {
			return s.length();
		}
		int ans=0;
		if(dp[i][j]!=-1){
			return dp[i][j];
		}
		if(s.charAt(i)==t.charAt(j)) {
			 ans= editTD(s,t,i+1,j+1,dp);
		}else {
			int ans1= editTD(s,t,i+1,j,dp);
			int ans2= editTD(s,t,i,j+1,dp);
			int ans3= editTD(s,t,i+1,j+1,dp);
			ans= Math.min(ans1,(Math.min(ans2, ans3)))+1;
		}
		return dp[i][j]= ans;
	}
	
	public static int edit(String s, String t, int i, int j) {
		if(i==s.length() && j==t.length()) {
			return 0;
		}
		if(i==s.length() && j!=t.length()) {
			return t.length()-j;
		}
		if(i!=s.length() && j==t.length()) {
			return s.length()-i;
		}
		int ans=0;
		if(s.charAt(i)==t.charAt(j)) {
			 ans= edit(s,t,i+1,j+1);
		}else {
			int ans1= edit(s,t,i+1,j);
			int ans2= edit(s,t,i,j+1);
			int ans3= edit(s,t,i+1,j+1);
			ans= Math.min(ans1,(Math.min(ans2, ans3)))+1;
		}
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int test=sc.nextInt();
		while(test-->0) {
			String s=sc.next();
			String t= sc.next();
			System.out.println(edit(s,t,0,0));
			int[][]dp= new int[s.length()+1][t.length()+1];
			for(int[]row:dp){
				Arrays.fill(row,-1);
			}
			System.out.println(editTD(s,t,0,0,dp));
		}
		

	}

}
