package OOP;

import java.util.Arrays;
import java.util.*;

public class Cars_client {
	
	public static void Display(Cars[]arr) {
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static <T extends Comparable<T>> void BubbleSort(T[]arr) { // here extends is not inheritance
//		only that kind of T will be taken which will have the logic for comparison
		//Boundary set- a type of T will come, which will have the logic for comparison
		
		for(int turn=1;turn<arr.length;turn++) {
			for(int i=0;i<arr.length-turn;i++) {
				if(arr[i].compareTo(arr[i+1])>0) { //error- arr[i]>arr[i+1]  because arr[i] will give an address 
					T temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
				}
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		make arrays of Cars type
		Cars[]arr= new Cars[5]; //null
//		only 5 reference are created where car can be put, but right now Car is null
		
		arr[0]= new Cars (2000,10,"green");
		arr[1]= new Cars (300,20,"blue");
		arr[2]= new Cars (400,30,"white");
		arr[3]= new Cars (500,40,"black");
		arr[4]= new Cars (600,50,"yellow");
		
		Arrays.sort(arr,new  Comparator <Cars>(){

			@Override          //this,  other
			public int compare(Cars o1, Cars o2) {
				// TODO Auto-generated method stub
				return o1.price-o2.price;
			}
			
		});
		
		Arrays.sort(arr,new  Comparator <Cars>(){

			@Override          //this,  other
			public int compare(Cars o1, Cars o2) {
				// TODO Auto-generated method stub
				return o2.speed-o1.speed;
			}
			
		});
		
		
		Arrays.sort(arr,new  Comparator <Cars>(){
			@Override          //this,  other
			public int compare(Cars o1, Cars o2) {
				// TODO Auto-generated method stub
				return o1.colour.compareTo(o2.colour);
			}
			
		});
		
		
//		BubbleSort(arr);
		Display(arr);
	}

}
