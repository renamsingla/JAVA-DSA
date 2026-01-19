package Heap;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Minimum_sum_pair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		PriorityQueue <Integer> pq= new PriorityQueue<>();
		
		int n=s.nextInt();
		int[]arr= new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
			pq.add(arr[i]);
		}
		
		int sum=0;
		while(pq.size()!=1) {
			int a= pq.remove();
			int b=pq.remove();
			sum+=a+b;
			pq.add(a+b);
		}
		
		System.out.println(sum);
	}

}
