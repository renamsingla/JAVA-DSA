package Basics;

import java.util.Random;

public class Generate_random_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int si=10;
		int ei=100;
		Random rn= new Random();
		for(int i=1;i<=10;i++) {
			int item= rn.nextInt(ei-si+1)+si;
			System.out.print(item+" ");
		}

	}

}
